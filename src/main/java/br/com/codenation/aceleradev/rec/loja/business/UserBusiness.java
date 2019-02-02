package br.com.codenation.aceleradev.rec.loja.business;

import br.com.codenation.aceleradev.rec.loja.bean.User;
import br.com.codenation.aceleradev.rec.loja.dao.UsuarioDao;
import br.com.codenation.aceleradev.rec.loja.exceptions.CpfInvalidoException;
import br.com.codenation.aceleradev.rec.loja.interfaces.UserInterface;

import java.sql.SQLException;

public class UserBusiness  implements UserInterface{

	public static String validarCpf(String cpf) {
		UsuarioDao usuarioDao = UsuarioDao.getInstance();
		try{
			if(usuarioDao.validarCpf(cpf)){
				return User.getInstance().getCpf();
			}
		}catch (Exception e){
			return e.getMessage();
		}
		return "";

	}

}
