package com.bianeck.structural.adapter.before.audio;

import com.bianeck.structural.adapter.before.ArquivoDeMidia;
import com.bianeck.structural.adapter.before.enums.TipoDeArquivo;
import com.bianeck.structural.adapter.before.exceptions.ArquivoInvalidoException;
import com.bianeck.structural.adapter.before.exceptions.FuncaoNaoSuportadaException;
import com.bianeck.structural.adapter.before.utils.Utils;

public class WavPlayer implements AudioPlayer {

    @Override
    public String playMp3(ArquivoDeMidia arquivoDeMidia) throws ArquivoInvalidoException, FuncaoNaoSuportadaException {
        throw new FuncaoNaoSuportadaException();
    }

    @Override
    public String playWav(ArquivoDeMidia arquivoDeMidia) throws ArquivoInvalidoException {
        return Utils.retornaString(arquivoDeMidia, TipoDeArquivo.WAV);
    }
}
