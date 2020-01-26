package com.bianeck.structural.adapter.depois.video;

import com.bianeck.structural.adapter.depois.ArquivoDeMidia;
import com.bianeck.structural.adapter.depois.adapters.VideoAudioAdapter;
import com.bianeck.structural.adapter.depois.enums.TipoDeArquivo;
import com.bianeck.structural.adapter.depois.exceptions.ArquivoNaoSuportadoException;

public class Mp4Player implements VideoPlayer {

    private VideoAudioAdapter videoAudioAdapter;

    @Override
    public String play(ArquivoDeMidia arquivoDeMidia) throws ArquivoNaoSuportadoException {
        switch (arquivoDeMidia.getTipoDeArquivo()) {
            case MP4:
                return reproduz(arquivoDeMidia, TipoDeArquivo.MP4);
            case MP3:
                videoAudioAdapter = new VideoAudioAdapter(arquivoDeMidia);
                return videoAudioAdapter.play(arquivoDeMidia);
            default:
                throw new ArquivoNaoSuportadoException(arquivoDeMidia);
        }
    }
}
