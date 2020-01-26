package com.bianeck.structural.adapter.after;

public class AudioPlayer implements MediaPlayer{

    @Override
    public String play(ArquivoDeMidia arquivoDeMidia) {
        return "Reproduzindo arquivo " + arquivoDeMidia.getTipoDeArquivo().name().toLowerCase() + ", nome: " + arquivoDeMidia;
    }
}
