package br.com.codenation.aceleradev.rec.loja.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.codenation.aceleradev.rec.loja.LojaSql;
import br.com.codenation.aceleradev.rec.loja.conexaoBanco.ConexaoJDBC;
import br.com.codenation.aceleradev.rec.loja.exceptions.CpfInvalidoException;

public class UsuarioDao {

	private static UsuarioDao instance;

	private UsuarioDao(){}

	public static UsuarioDao getInstance(){
		if(instance == null){
			instance = new UsuarioDao();
		}
		return instance;
	}
	
	public Boolean validarCpf(String cpf) throws CpfInvalidoException {
			
		Boolean existeCpf = false ;
		
		ConexaoJDBC conexao = new ConexaoJDBC();
		conexao.getConexaoMySQL();
		ResultSet resultado= null;
		
		PreparedStatement query = null;
		try {
		 resultado = query.executeQuery(LojaSql.SELECT_USUARIO_CPF);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(resultado != null) {
			existeCpf = true;
		}else {
			throw new CpfInvalidoException();
		}
		
		
		return existeCpf;
		
	}
	

}
