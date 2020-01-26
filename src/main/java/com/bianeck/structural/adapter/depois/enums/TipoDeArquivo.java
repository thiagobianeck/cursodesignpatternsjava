package com.bianeck.structural.adapter.depois.enums;

public enum TipoDeArquivo {
    MP3("mp3"),
    WMA("wma"),
    MP4("mp4"),
    MKV("mkv");

    private String tipo;

    TipoDeArquivo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
