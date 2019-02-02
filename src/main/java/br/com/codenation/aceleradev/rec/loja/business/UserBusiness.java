package br.com.codenation.aceleradev.rec.loja.business;

import br.com.codenation.aceleradev.rec.loja.bean.User;
import br.com.codenation.aceleradev.rec.loja.dao.UsuarioDao;
import br.com.codenation.aceleradev.rec.loja.exceptions.CpfInvalidoException;
import br.com.codenation.aceleradev.rec.loja.interfaces.UserInterface;

import java.sql.SQLException;

public class UserBusiness  implements UserInterface{

	public static boolean validarCpf(String cpf) {
		UsuarioDao usuarioDao = UsuarioDao.getInstance();
		try{
			return usuarioDao.validarCpf(cpf);
		}catch (CpfInvalidoException e){
			throw e;
		}catch (SQLException e){
			//TODO: tirar isso depois
			e.printStackTrace();
		}
		return false;

	}

}
