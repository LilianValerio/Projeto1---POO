package br.com.codenation.aceleradev.rec.loja.business;

import br.com.codenation.aceleradev.rec.loja.dao.UsuarioDao;
import br.com.codenation.aceleradev.rec.loja.exceptions.CpfInvalidoException;
import br.com.codenation.aceleradev.rec.loja.interfaces.UserInterface;

public class UserBusiness  implements UserInterface{

	public Boolean validarCpf(String cpf) throws CpfInvalidoException{
		UsuarioDao usuarioDao = new UsuarioDao();
		if(usuarioDao.validarCpf(cpf)){
			return true;
		}else{
			throw new CpfInvalidoException();
		}
	}

}
