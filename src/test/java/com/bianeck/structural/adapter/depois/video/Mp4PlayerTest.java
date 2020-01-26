package com.bianeck.structural.adapter.depois.video;

import com.bianeck.structural.adapter.depois.ArquivoDeMidia;
import com.bianeck.structural.adapter.depois.enums.TipoDeArquivo;
import com.bianeck.structural.adapter.depois.exceptions.ArquivoNaoSuportadoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Mp4PlayerTest {

    private VideoPlayer videoPlayer;

    @BeforeEach
    public void setUp() {
        videoPlayer = new Mp4Player();
    }

    @Test
    @DisplayName("Deve reproduzir arquivo mp4")
    public void mustPlayMp4File() throws ArquivoNaoSuportadoException {
        //cenario
        final ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia("Me chama", TipoDeArquivo.MP4);

        //execucao
        String resultado = videoPlayer.play(arquivoDeMidia);

        //verificacao
        String resultadoEsperado = String.format("Reproduzindo arquivo %s, nome: %s", arquivoDeMidia.getFormato(), arquivoDeMidia.getNomeCompleto());
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("Não deve reproduzir arquivo mkv")
    public void mustNotReproduceMkvFile() {
        //cenario
        final ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia("Me chama", TipoDeArquivo.MKV);

        //verificacao
        String exception = String.format("Formato de arquivo %s não suportado: Arquivo: %s.", arquivoDeMidia.getFormato(), arquivoDeMidia.getNomeCompleto());
        Assertions.assertThrows(ArquivoNaoSuportadoException.class,
                () -> videoPlayer.play(arquivoDeMidia), exception);
    }

    @Test
    @DisplayName("Deve reproduzir arquivo mp3")
    public void mustPlayMp3File() throws ArquivoNaoSuportadoException {
        // cenario
        final ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia("Me chama", TipoDeArquivo.MP3);

        //execucao
        String resultado = videoPlayer.play(arquivoDeMidia);

        //verificacao
        String resultadoEsperado = String.format("Reproduzindo arquivo %s, nome: %s", arquivoDeMidia.getFormato(), arquivoDeMidia.getNomeCompleto());
        Assertions.assertEquals(resultadoEsperado, resultado);

    }

    @Test
    @DisplayName("Não deve reproduzir arquivo wma")
    public void mustNotReproduceWmaFile() {
        //cenario
        final ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia("Me chama", TipoDeArquivo.WMA);

        //verificacao
        String exception = String.format("Formato de arquivo %s não suportado: Arquivo: %s.", arquivoDeMidia.getFormato(), arquivoDeMidia.getNomeCompleto());
        Assertions.assertThrows(ArquivoNaoSuportadoException.class,
                () -> videoPlayer.play(arquivoDeMidia), exception);
    }

}
