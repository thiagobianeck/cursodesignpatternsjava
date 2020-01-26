package com.bianeck.structural.adapter.before.exceptions;

public class FuncaoNaoSuportadaException extends Exception{

    public FuncaoNaoSuportadaException() {
        super("Função não suportada para este player.");
    }
}
