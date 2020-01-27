package com.bianeck.structural.adapter.depois.video;

import com.bianeck.structural.adapter.depois.ArquivoDeMidia;
import com.bianeck.structural.adapter.depois.enums.TipoDeArquivo;
import com.bianeck.structural.adapter.depois.exceptions.ArquivoNaoSuportadoException;

public class MkvPlayer implements VideoPlayer {
    @Override
    public String play(ArquivoDeMidia arquivoDeMidia) {
        switch (arquivoDeMidia.getTipoDeArquivo()) {
            case MKV:
                return reproduz(arquivoDeMidia, TipoDeArquivo.MKV);
            default:
                throw new ArquivoNaoSuportadoException(arquivoDeMidia);
        }
    }
}
