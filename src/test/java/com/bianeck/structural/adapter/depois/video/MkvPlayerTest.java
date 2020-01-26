package com.bianeck.structural.adapter.depois.video;

import com.bianeck.structural.adapter.depois.ArquivoDeMidia;
import com.bianeck.structural.adapter.depois.audio.Mp3Player;
import com.bianeck.structural.adapter.depois.enums.TipoDeArquivo;
import com.bianeck.structural.adapter.depois.exceptions.ArquivoNaoSuportadoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MkvPlayerTest {

    private VideoPlayer videoPlayer;

    @BeforeEach
    public void setUp() {
        videoPlayer = new MkvPlayer();
    }

    @Test
    @DisplayName("Deve reproduzir arquivo mkv")
    public void mustPlayMkvFile() throws ArquivoNaoSuportadoException {
        //cenario
        final ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia("Me chama", TipoDeArquivo.MKV);

        //execucao
        String resultado = videoPlayer.play(arquivoDeMidia);

        //verificacao
        String resultadoEsperado = String.format("Reproduzindo arquivo %s, nome: %s", arquivoDeMidia.getFormato(), arquivoDeMidia.getNomeCompleto());
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    @DisplayName("Não deve reproduzir arquivo mp4")
    public void mustNotReproduceMp4File() {
        //cenario
        final ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia("Me chama", TipoDeArquivo.MP4);

        //verificacao
        String exception = String.format("Formato de arquivo %s não suportado: Arquivo: %s.", arquivoDeMidia.getFormato(), arquivoDeMidia.getNomeCompleto());
        Assertions.assertThrows(ArquivoNaoSuportadoException.class,
                () -> videoPlayer.play(arquivoDeMidia), exception);
    }

}
