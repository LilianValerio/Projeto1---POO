package br.com.codenation.aceleradev.rec.loja.business;

import br.com.codenation.aceleradev.rec.loja.dao.UsuarioDao;
import br.com.codenation.aceleradev.rec.loja.interfaces.UserInterface;

public class UserBusiness  implements UserInterface{

	public Boolean validarCpf(String cpf) {
		UsuarioDao usuarioDao = new UsuarioDao();
		return usuarioDao.validarCpf(cpf);
	}

}
