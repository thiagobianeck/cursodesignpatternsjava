package com.bianeck.structural.adapter.depois;

import com.bianeck.structural.adapter.depois.enums.TipoDeArquivo;
import com.bianeck.structural.adapter.depois.exceptions.ArquivoNaoSuportadoException;

public interface MediaPlayer {

    String play(ArquivoDeMidia arquivoDeMidia) ;

    default String reproduz(ArquivoDeMidia arquivoDeMidia, TipoDeArquivo tipoEsperado) {
        if(tipoEsperado.equals(arquivoDeMidia.getTipoDeArquivo()))
            return String.format("Reproduzindo arquivo %s, nome: %s", arquivoDeMidia.getFormato(), arquivoDeMidia.getNomeCompleto());
        else
            throw new ArquivoNaoSuportadoException(arquivoDeMidia);
    }
}
