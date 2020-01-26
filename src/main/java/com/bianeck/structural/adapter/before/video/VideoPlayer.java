package com.bianeck.structural.adapter.before.video;

import com.bianeck.structural.adapter.before.ArquivoDeMidia;

public interface VideoPlayer {

    String playMp4(ArquivoDeMidia arquivoDeMidia) throws Exception;
    String playVlc(ArquivoDeMidia arquivoDeMidia) throws Exception;
    String play(ArquivoDeMidia arquivoDeMidia) throws Exception;
}
