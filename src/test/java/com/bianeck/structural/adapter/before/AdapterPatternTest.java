package com.bianeck.structural.adapter.before;

import com.bianeck.structural.adapter.before.audio.AudioPlayer;
import com.bianeck.structural.adapter.before.audio.Mp3Player;
import com.bianeck.structural.adapter.before.audio.WavPlayer;
import com.bianeck.structural.adapter.before.enums.TipoDeArquivo;
import com.bianeck.structural.adapter.before.exceptions.ArquivoInvalidoException;
import com.bianeck.structural.adapter.before.exceptions.FuncaoNaoSuportadaException;
import com.bianeck.structural.adapter.before.video.Mp4Player;
import com.bianeck.structural.adapter.before.video.VideoPlayer;
import com.bianeck.structural.adapter.before.video.VlcPlayer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class AdapterPatternTest {

    @Test
    @DisplayName("Deve reproduzir arquivo mp3")
    public void playMusicMp3() throws Exception {

        AudioPlayer mp3Player = new Mp3Player();
        ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia("Musica a", TipoDeArquivo.MP3);

        String playMp3 = mp3Player.playMp3(arquivoDeMidia);

        assertThat(playMp3).isEqualTo("Reproduzindo arquivo mp3, nome: Musica a.mp3");

    }

    @Test
    @DisplayName("Deve lançar erro ao tentar reproduzir wav em player mp3")
    public void playMusicWavInPlayerMp3(){

        AudioPlayer mp3Player = new Mp3Player();
        ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia("Musica b", TipoDeArquivo.WAV);

        Throwable exception = catchThrowable(() -> mp3Player.playMp3(arquivoDeMidia));

        assertThat(exception)
                .isInstanceOf(ArquivoInvalidoException.class)
                .hasMessage("Tipo de arquivo wav inválido para o player.");
    }

    @Test
    @DisplayName("Deve lançar erro ao tentar reproduzir playWav em player mp3")
    public void callPlayWavInPlayerMp3(){

        AudioPlayer mp3Player = new Mp3Player();
        ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia("Musica e", TipoDeArquivo.WAV);

        Throwable exception = catchThrowable(() -> mp3Player.playWav(arquivoDeMidia));

        assertThat(exception)
                .isInstanceOf(FuncaoNaoSuportadaException.class)
                .hasMessage("Função não suportada para este player.");
    }

    @Test
    @DisplayName("Deve reproduzir arquivo wav")
    public void playMusicWav() throws Exception {

        AudioPlayer wavPlayer = new WavPlayer();
        ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia("Musica c", TipoDeArquivo.WAV);

        String playMp3 = wavPlayer.playWav(arquivoDeMidia);

        assertThat(playMp3).isEqualTo("Reproduzindo arquivo wav, nome: Musica c.wav");

    }

    @Test
    @DisplayName("Deve lançar erro ao tentar reproduzir mp3 em player wav")
    public void playMusicMp3InPlayerWav(){

        AudioPlayer audioPlayer = new WavPlayer();
        ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia("Musica d", TipoDeArquivo.MP3);

        Throwable exception = catchThrowable(() -> audioPlayer.playWav(arquivoDeMidia));

        assertThat(exception)
                .isInstanceOf(ArquivoInvalidoException.class)
                .hasMessage("Tipo de arquivo mp3 inválido para o player.");
    }

    @Test
    @DisplayName("Deve lançar erro ao tentar reproduzir playMp3 em player wav")
    public void callPlayMp3InPlayerWav(){

        AudioPlayer wavPlayer = new WavPlayer();
        ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia("Musica x", TipoDeArquivo.MP3);

        Throwable exception = catchThrowable(() -> wavPlayer.playMp3(arquivoDeMidia));

        assertThat(exception)
                .isInstanceOf(FuncaoNaoSuportadaException.class)
                .hasMessage("Função não suportada para este player.");
    }

    @Test
    @DisplayName("Deve reproduzir arquivo mp4")
    public void playVideoMp4() throws Exception {

        final String titulo = "Video a";

        VideoPlayer mp4Player = new Mp4Player();
        ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia(titulo, TipoDeArquivo.MP4);

        String playMp4 = mp4Player.playMp4(arquivoDeMidia);

        assertThat(playMp4).isEqualTo("Reproduzindo arquivo mp4, nome: " + titulo + ".mp4");

    }

    @Test
    @DisplayName("Deve reproduzir arquivo vlc")
    public void playVideoVlc() throws Exception {

        final String titulo = "Video a";

        VideoPlayer vlcPlayer = new VlcPlayer();
        ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia(titulo, TipoDeArquivo.VLC);

        String playMp4 = vlcPlayer.playVlc(arquivoDeMidia);

        assertThat(playMp4).isEqualTo("Reproduzindo arquivo vlc, nome: " + titulo + ".vlc");

    }

    @Test
    @DisplayName("Player de video Deve reproduzir mp3 em mp4")
    public void playAudioInVideoPlayer() throws Exception {

        final String titulo = "Audio a";

        VideoPlayer mp4Player = new Mp4Player();
        ArquivoDeMidia arquivoDeMidia = new ArquivoDeMidia(titulo, TipoDeArquivo.MP3);

        String playMp3 = mp4Player.play(arquivoDeMidia);

        assertThat(playMp3).isEqualTo("Reproduzindo arquivo mp3, nome: " + titulo + ".mp3");

    }
}
