package com.bianeck.structural.adapter.depois.audio;

import com.bianeck.structural.adapter.depois.ArquivoDeMidia;
import com.bianeck.structural.adapter.depois.enums.TipoDeArquivo;
import com.bianeck.structural.adapter.depois.exceptions.ArquivoNaoSuportadoException;

public class Mp3Player implements AudioPlayer {
    @Override
    public String play(ArquivoDeMidia arquivoDeMidia) throws ArquivoNaoSuportadoException {
        switch (arquivoDeMidia.getTipoDeArquivo()) {
            case MP3:
                return reproduz(arquivoDeMidia, TipoDeArquivo.MP3);
            default:
                throw new ArquivoNaoSuportadoException(arquivoDeMidia);
        }
    }
}
