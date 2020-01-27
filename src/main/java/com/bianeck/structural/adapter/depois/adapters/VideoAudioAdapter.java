package com.bianeck.structural.adapter.depois.adapters;

import com.bianeck.structural.adapter.depois.ArquivoDeMidia;
import com.bianeck.structural.adapter.depois.audio.AudioPlayer;
import com.bianeck.structural.adapter.depois.audio.Mp3Player;
import com.bianeck.structural.adapter.depois.exceptions.ArquivoNaoSuportadoException;
import com.bianeck.structural.adapter.depois.video.VideoPlayer;

public class VideoAudioAdapter implements VideoPlayer {

    private AudioPlayer audioPlayer;

    public VideoAudioAdapter(ArquivoDeMidia arquivoDeMidia) {
        switch (arquivoDeMidia.getTipoDeArquivo()) {
            case MP3:
                audioPlayer = new Mp3Player();
                break;
            default:
                throw new ArquivoNaoSuportadoException(arquivoDeMidia);
        }
    }

    @Override
    public String play(ArquivoDeMidia arquivoDeMidia) {
        switch (arquivoDeMidia.getTipoDeArquivo()) {
            case MP3:
                return audioPlayer.play(arquivoDeMidia);
            default:
                throw new ArquivoNaoSuportadoException(arquivoDeMidia);
        }
    }
}
