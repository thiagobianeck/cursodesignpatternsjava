package com.bianeck.structural.adapter.depois.exceptions;

import com.bianeck.structural.adapter.depois.ArquivoDeMidia;

public class ArquivoNaoSuportadoException extends RuntimeException{

    private ArquivoDeMidia arquivoDeMidia;

    public ArquivoNaoSuportadoException(ArquivoDeMidia arquivoDeMidia) {
        this.arquivoDeMidia = arquivoDeMidia;
    }

    @Override
    public String getMessage() {
        return String.format("Formato de arquivo %s não suportado: Arquivo: %s.", this.arquivoDeMidia.getFormato(), this.arquivoDeMidia.getNomeCompleto());
    }
}
