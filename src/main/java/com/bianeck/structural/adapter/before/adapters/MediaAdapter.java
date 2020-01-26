package com.bianeck.structural.adapter.before.adapters;

import com.bianeck.structural.adapter.before.ArquivoDeMidia;
import com.bianeck.structural.adapter.before.audio.AudioPlayer;
import com.bianeck.structural.adapter.before.audio.Mp3Player;
import com.bianeck.structural.adapter.before.audio.WavPlayer;
import com.bianeck.structural.adapter.before.exceptions.FuncaoNaoSuportadaException;
import com.bianeck.structural.adapter.before.video.VideoPlayer;

public class MediaAdapter implements VideoPlayer {

    private AudioPlayer audioPlayer;

    public MediaAdapter(ArquivoDeMidia arquivoDeMidia) {
        switch (arquivoDeMidia.getTipoDeArquivo()) {
            case MP3:
                audioPlayer = new Mp3Player();
                break;
            case WAV:
                audioPlayer = new WavPlayer();
                break;
        }
    }

    @Override
    public String playMp4(ArquivoDeMidia arquivoDeMidia) throws Exception {
        throw new FuncaoNaoSuportadaException();
    }

    @Override
    public String playVlc(ArquivoDeMidia arquivoDeMidia) throws Exception {
        throw new FuncaoNaoSuportadaException();
    }

    @Override
    public String play(ArquivoDeMidia arquivoDeMidia) throws Exception {
        switch (arquivoDeMidia.getTipoDeArquivo()) {
            case MP3:
                return audioPlayer.playMp3(arquivoDeMidia);
            case WAV:
                return audioPlayer.playWav(arquivoDeMidia);
            default:
                throw new FuncaoNaoSuportadaException();
        }
    }
}
