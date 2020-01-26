package com.bianeck.structural.adapter.before.video;

import com.bianeck.structural.adapter.before.ArquivoDeMidia;
import com.bianeck.structural.adapter.before.enums.TipoDeArquivo;
import com.bianeck.structural.adapter.before.exceptions.FuncaoNaoSuportadaException;
import com.bianeck.structural.adapter.before.utils.Utils;

public class VlcPlayer implements VideoPlayer {

    @Override
    public String playMp4(ArquivoDeMidia arquivoDeMidia) throws Exception {
        throw new FuncaoNaoSuportadaException();
    }

    @Override
    public String playVlc(ArquivoDeMidia arquivoDeMidia) throws Exception {
        return Utils.retornaString(arquivoDeMidia, TipoDeArquivo.VLC);
    }

    @Override
    public String play(ArquivoDeMidia arquivoDeMidia) throws Exception {
        throw new FuncaoNaoSuportadaException();
    }


}
