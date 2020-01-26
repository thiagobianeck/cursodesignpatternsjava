package com.bianeck.structural.adapter.after;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Mp3PlayerTest {

    private AudioPlayer mp3Player;

    @BeforeEach
    public void setUp() {
        mp3Player = new Mp3Player();
    }

    @Test
    @DisplayName("Deve reproduzir mp3 player")
    public void mustPlayMp3() {
        //cenario
        final String nomeMusica = "Quando eu te encontrar";
        final String tipoArquivo = "mp3";

        //execucao
        String musicaReproduzida = mp3Player.playMp3(tipoArquivo, nomeMusica);

        //verificacao
        assertThat(musicaReproduzida).isEqualTo("Reproduzindo arquivo " + tipoArquivo + ", nome: " + nomeMusica);
    }

    @Test
    @DisplayName("Não deve reproduzir qualquer outro formato de arquivo")
    public void mustNotReproduceAnyOtherFileFormat() {

        //cenario
        final String nomeMusica = "Quando eu te encontrar";
        final String tipoArquivo = "xxx";

        //execucao
        Throwable exception = Assertions.catchThrowable(() -> mp3Player.playMp3(tipoArquivo, nomeMusica));

        //verificacao
        String messageException = String.format("Formato de Arquivo inválido %s.%s, formato não suportado", nomeMusica, tipoArquivo);
        Assertions.assertThat(exception).isInstanceOf(Exception.class).hasMessage(messageException);
    }

}