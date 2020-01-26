package com.bianeck.structural.adapter.antes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WmaPlayerTest {

    private AudioPlayer audioPlayer;

    @BeforeEach
    public void setUp() {
        audioPlayer = new WmaPlayer();
    }

    @Test
    @DisplayName("Deve reproduzir arquivo wma")
    public void mustPlayWmaFile() {
        //cenario
        final String nomeDoArquivo = "Me chama";
        final String tipoDeArquivo = "wma";

        //execucao
        String resultado = audioPlayer.playWma(tipoDeArquivo, nomeDoArquivo);

        //verificacao
        String resultadoEsperado = String.format("Reproduzindo arquivo %s, nome: %s.%s", tipoDeArquivo, nomeDoArquivo, tipoDeArquivo);
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("Não deve reproduzir arquivo mp3")
    public void mustNotReproduceMp3File() {
        //cenario
        final String nomeDoArquivo = "Me chama";
        final String tipoDeArquivo = "mp3";

        //verificacao
        String exception = String.format("Formato de arquivo %s não suportado: Arquivo: %s.%s.", tipoDeArquivo, nomeDoArquivo, tipoDeArquivo);
        Assertions.assertThrows(UnsupportedOperationException.class,
                () -> audioPlayer.playMp3(tipoDeArquivo, nomeDoArquivo), exception);
    }

    @Test
    @DisplayName("Não deve reproduzir outro formato de arquivo")
    public void mustNotReproduceAnotherFileFormat() {
        //cenario
        final String nomeDoArquivo = "Me chama";
        final String tipoDeArquivo = "xyz";

        //verificacao
        String exception = String.format("Formato de arquivo %s não suportado: Arquivo: %s.%s.", tipoDeArquivo, nomeDoArquivo, tipoDeArquivo);
        Assertions.assertThrows(UnsupportedOperationException.class,
                () -> audioPlayer.playWma(tipoDeArquivo, nomeDoArquivo), exception);
    }

}
