package com.bianeck.structural.adapter.depois;

import com.bianeck.structural.adapter.depois.enums.TipoDeArquivo;

public class ArquivoDeMidia {

    private String nomeArquivo;
    private TipoDeArquivo tipoDeArquivo;

    public ArquivoDeMidia(String nomeArquivo, TipoDeArquivo tipoDeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.tipoDeArquivo = tipoDeArquivo;
    }


    public String getFormato() {
        return this.tipoDeArquivo.getTipo();
    }

    public String getNomeCompleto() {
        return this.nomeArquivo + "." + this.tipoDeArquivo;
    }

    public TipoDeArquivo getTipoDeArquivo() {
        return tipoDeArquivo;
    }
}
