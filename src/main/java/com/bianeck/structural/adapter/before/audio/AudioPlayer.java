package com.bianeck.structural.adapter.before.audio;

import com.bianeck.structural.adapter.before.ArquivoDeMidia;

public interface AudioPlayer {
    String playMp3(ArquivoDeMidia arquivoDeMidia) throws Exception;
    String playWav(ArquivoDeMidia arquivoDeMidia) throws Exception;
}
