package com.bianeck.structural.adapter.before.video;

import com.bianeck.structural.adapter.before.ArquivoDeMidia;
import com.bianeck.structural.adapter.before.adapters.MediaAdapter;
import com.bianeck.structural.adapter.before.enums.TipoDeArquivo;
import com.bianeck.structural.adapter.before.exceptions.ArquivoInvalidoException;
import com.bianeck.structural.adapter.before.exceptions.FuncaoNaoSuportadaException;
import com.bianeck.structural.adapter.before.utils.Utils;

public class Mp4Player implements VideoPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public String playMp4(ArquivoDeMidia arquivoDeMidia) throws Exception {
        return Utils.retornaString(arquivoDeMidia, TipoDeArquivo.MP4);
    }

    @Override
    public String playVlc(ArquivoDeMidia arquivoDeMidia) throws Exception {
        throw new FuncaoNaoSuportadaException();
    }

    @Override
    public String play(ArquivoDeMidia arquivoDeMidia) throws Exception {
        switch (arquivoDeMidia.getTipoDeArquivo()) {
            case MP3:
            case WAV:
                mediaAdapter = new MediaAdapter(arquivoDeMidia);
                return mediaAdapter.play(arquivoDeMidia);
            default:
                throw new ArquivoInvalidoException(arquivoDeMidia);
        }
    }
}
