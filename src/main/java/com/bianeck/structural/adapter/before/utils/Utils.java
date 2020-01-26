package com.bianeck.structural.adapter.before.utils;

import com.bianeck.structural.adapter.before.ArquivoDeMidia;
import com.bianeck.structural.adapter.before.enums.TipoDeArquivo;
import com.bianeck.structural.adapter.before.exceptions.ArquivoInvalidoException;

public class Utils {

    private Utils() {}

    public static String retornaString(ArquivoDeMidia arquivoDeMidia, TipoDeArquivo tipoDeArquivo) throws ArquivoInvalidoException {
        if(tipoDeArquivo.equals(arquivoDeMidia.getTipoDeArquivo())) {
            return "Reproduzindo arquivo " + arquivoDeMidia.getTipoDeArquivo().getTipo() + ", nome: " + arquivoDeMidia;
        } else {
            throw new ArquivoInvalidoException(arquivoDeMidia);
        }
    }
}
