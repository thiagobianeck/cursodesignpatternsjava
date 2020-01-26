package com.bianeck.structural.adapter.before.exceptions;

import com.bianeck.structural.adapter.before.ArquivoDeMidia;

public class ArquivoInvalidoException extends Exception{

    private ArquivoDeMidia arquivoDeMidia;

    public ArquivoInvalidoException(ArquivoDeMidia arquivoDeMidia) {
        super();
        this.arquivoDeMidia = arquivoDeMidia;
    }

    @Override
    public String getMessage() {
        return "Tipo de arquivo " + arquivoDeMidia.getTipoDeArquivo().getTipo() + " inválido para o player.";
    }

}
