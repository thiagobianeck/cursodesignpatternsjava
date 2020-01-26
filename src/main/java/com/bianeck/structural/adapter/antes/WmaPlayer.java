package com.bianeck.structural.adapter.antes;

public class WmaPlayer implements AudioPlayer {

    @Override
    public String playMp3(String tipoDeArquivo, String nomeDoArquivo) {
        throw new UnsupportedOperationException(String.format("Formato de arquivo %s não suportado: Arquivo: %s.%s.", tipoDeArquivo, nomeDoArquivo, tipoDeArquivo));
    }

    @Override
    public String playWma(String tipoDeArquivo, String nomeDoArquivo) {
        return reproduz(tipoDeArquivo, nomeDoArquivo, "wma");
    }
}
