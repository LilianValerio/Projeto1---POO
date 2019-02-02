package br.com.codenation.aceleradev.rec.loja.exceptions;

import br.com.codenation.aceleradev.rec.loja.util.Messages;

public class CpfInvalidoException extends RuntimeException {

    public CpfInvalidoException() {
        super();
    }

    @Override
    public String getMessage() {
        return Messages.ERRO_CPF_INVALIDO;
    }
}
