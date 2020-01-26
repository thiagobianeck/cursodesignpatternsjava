package com.bianeck.structural.adapter.after;

public class ArquivoDeMidia {

    private String titulo;
    private TipoDeArquivo tipoDeArquivo;

    public ArquivoDeMidia(String titulo, TipoDeArquivo tipoDeArquivo) {
        this.titulo = titulo;
        this.tipoDeArquivo = tipoDeArquivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public TipoDeArquivo getTipoDeArquivo() {
        return tipoDeArquivo;
    }

    @Override
    public String toString() {
        return this.titulo + "." + tipoDeArquivo.name().toLowerCase();
    }
}
