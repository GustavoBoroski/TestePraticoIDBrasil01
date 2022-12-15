package br.com.idbrasil.exception;

public class NumeroMaiorNaoSoma extends Exception{

    public NumeroMaiorNaoSoma(String msg){
        super(msg);
    }

    public NumeroMaiorNaoSoma(String msg, Throwable cause){
        super(msg, cause);
    }
}
