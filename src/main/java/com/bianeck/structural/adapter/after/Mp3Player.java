package com.bianeck.structural.adapter.after;

public class Mp3Player implements AudioPlayer {

    @Override
    public String playMp3(String tipoDeArquivo, String nomeDoArquivo) {
        if("mp3".equals(tipoDeArquivo)) {
            return "Reproduzindo arquivo " + tipoDeArquivo + ", nome: " + nomeDoArquivo;
        } else {
            throw new UnsupportedOperationException(String.format("Formato de Arquivo inválido %s.%s, formato não suportado", nomeDoArquivo, tipoDeArquivo));
        }
    }
}
