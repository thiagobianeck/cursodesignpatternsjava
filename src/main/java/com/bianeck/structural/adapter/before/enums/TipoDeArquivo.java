package com.bianeck.structural.adapter.before.enums;

public enum TipoDeArquivo {
    MP3("mp3"),
    WAV("wav"),
    MP4("mp4"),
    VLC("vlc");

    private String tipo;

    TipoDeArquivo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
