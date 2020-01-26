package com.bianeck.structural.adapter.depois;

import com.bianeck.structural.adapter.depois.enums.TipoDeArquivo;
import com.bianeck.structural.adapter.depois.exceptions.ArquivoNaoSuportadoException;

public interface MediaPlayer {

    String play(ArquivoDeMidia arquivoDeMidia) throws ArquivoNaoSuportadoException;

    default String reproduz(ArquivoDeMidia arquivoDeMidia, TipoDeArquivo tipoEsperado) throws ArquivoNaoSuportadoException {
        if(tipoEsperado.equals(arquivoDeMidia.getTipoDeArquivo()))
            return String.format("Reproduzindo arquivo %s, nome: %s", arquivoDeMidia.getFormato(), arquivoDeMidia.getNomeCompleto());
        else
            throw new ArquivoNaoSuportadoException(arquivoDeMidia);
    }
}
