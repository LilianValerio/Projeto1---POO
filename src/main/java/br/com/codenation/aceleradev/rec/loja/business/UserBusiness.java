package br.com.codenation.aceleradev.rec.loja.business;

import br.com.codenation.aceleradev.rec.loja.bean.User;
import br.com.codenation.aceleradev.rec.loja.dao.UsuarioDao;
import br.com.codenation.aceleradev.rec.loja.exceptions.CpfInvalidoException;
import br.com.codenation.aceleradev.rec.loja.interfaces.UserInterface;

public class UserBusiness  implements UserInterface{

	public static String validarCpf(String cpf) {
		UsuarioDao usuarioDao = UsuarioDao.getInstance();
		try{
			if(usuarioDao.validarCpf(cpf)){
				return User.getInstance().getCpf();
			}
		}catch (CpfInvalidoException e){
			return e.getMessage();
		}
		return "";

	}

}
