package com.bianeck.structural.adapter.depois.audio;

import com.bianeck.structural.adapter.depois.ArquivoDeMidia;
import com.bianeck.structural.adapter.depois.enums.TipoDeArquivo;
import com.bianeck.structural.adapter.depois.exceptions.ArquivoNaoSuportadoException;
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
    public void mustPlayWmaFile() throws ArquivoNaoSuportadoException {
        //cenario
        final ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia("Me chama", TipoDeArquivo.WMA);

        //execucao
        String resultado = audioPlayer.play(arquivoDeMidia);

        //verificacao
        String resultadoEsperado = String.format("Reproduzindo arquivo %s, nome: %s", arquivoDeMidia.getFormato(), arquivoDeMidia.getNomeCompleto());
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("Não deve reproduzir arquivo mp3")
    public void mustNotReproduceMp3File() {
        //cenario
        final ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia("Me chama", TipoDeArquivo.MP3);

        //verificacao
        String exception = String.format("Formato de arquivo %s não suportado: Arquivo: %s.", arquivoDeMidia.getFormato(), arquivoDeMidia.getNomeCompleto());
        Assertions.assertThrows(ArquivoNaoSuportadoException.class,
                () -> audioPlayer.play(arquivoDeMidia), exception);
    }

}
