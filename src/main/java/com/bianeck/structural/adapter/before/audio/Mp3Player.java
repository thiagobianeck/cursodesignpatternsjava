package com.bianeck.structural.adapter.before.audio;

import com.bianeck.structural.adapter.before.ArquivoDeMidia;
import com.bianeck.structural.adapter.before.enums.TipoDeArquivo;
import com.bianeck.structural.adapter.before.exceptions.FuncaoNaoSuportadaException;
import com.bianeck.structural.adapter.before.utils.Utils;

public class Mp3Player implements AudioPlayer {

    @Override
    public String playMp3(ArquivoDeMidia arquivoDeMidia) throws Exception {
        return Utils.retornaString(arquivoDeMidia, TipoDeArquivo.MP3);
    }

    @Override
    public String playWav(ArquivoDeMidia arquivoDeMidia) throws Exception {
        throw new FuncaoNaoSuportadaException();
    }


}
