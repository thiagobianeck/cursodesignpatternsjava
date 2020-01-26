package com.bianeck.structural.adapter.after;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdapterPatternTest {

    @Test
    @DisplayName("Deve tocar musica mp3")
    public void playMusic() {

        AudioPlayer audioPlayer = new AudioPlayer();
        ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia("Musica a", TipoDeArquivo.MP3);

        String playMp3 = audioPlayer.play(arquivoDeMidia);

        Assertions.assertThat(playMp3).isEqualTo("Reproduzindo arquivo mp3, nome: Musica a.mp3");

    }
}
