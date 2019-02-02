package br.com.codenation.aceleradev.rec.loja.exceptions;

import br.com.codenation.aceleradev.rec.loja.util.Error;

public class CpfInvalidoException extends RuntimeException {

    public CpfInvalidoException() {
        super();
    }

    @Override
    public String getMessage() {
        return Error.ERRO_CPF_INVALIDO;
    }
}
