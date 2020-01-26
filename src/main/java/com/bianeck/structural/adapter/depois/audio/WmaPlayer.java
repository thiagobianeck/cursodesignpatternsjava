package com.bianeck.structural.adapter.depois.audio;

import com.bianeck.structural.adapter.depois.ArquivoDeMidia;
import com.bianeck.structural.adapter.depois.enums.TipoDeArquivo;
import com.bianeck.structural.adapter.depois.exceptions.ArquivoNaoSuportadoException;

public class WmaPlayer implements AudioPlayer {
    @Override
    public String play(ArquivoDeMidia arquivoDeMidia) throws ArquivoNaoSuportadoException {
        switch (arquivoDeMidia.getTipoDeArquivo()) {
            case WMA:
                return reproduz(arquivoDeMidia, TipoDeArquivo.WMA);
            default:
                throw new ArquivoNaoSuportadoException(arquivoDeMidia);
        }
    }
}
