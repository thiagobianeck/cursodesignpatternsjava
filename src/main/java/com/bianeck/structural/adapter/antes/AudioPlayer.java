package com.bianeck.structural.adapter.antes;

public interface AudioPlayer {
    String playMp3(String tipoDeArquivo, String nomeDoArquivo);

    String playWma(String tipoDeArquivo, String nomeDoArquivo);

    default String reproduz(String tipoDeArquivo, String nomeDoArquivo, String tipoEsperado) {
        if(tipoEsperado.equals(tipoDeArquivo))
            return String.format("Reproduzindo arquivo %s, nome: %s.%s", tipoDeArquivo, nomeDoArquivo, tipoDeArquivo);
        else
            throw new UnsupportedOperationException(String.format("Formato de arquivo %s não suportado: Arquivo: %s.%s.", tipoDeArquivo, nomeDoArquivo, tipoDeArquivo));
    }
}
