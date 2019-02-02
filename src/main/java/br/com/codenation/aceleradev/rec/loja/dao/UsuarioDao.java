package br.com.codenation.aceleradev.rec.loja.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.codenation.aceleradev.rec.loja.LojaSql;
import br.com.codenation.aceleradev.rec.loja.conexaoBanco.ConexaoJDBC;

public class UsuarioDao {
	
	
	public Boolean validarCpf(String cpf) {
			
		Boolean existeCpf = false ;
		
		ConexaoJDBC conexao = new ConexaoJDBC();
		conexao.getConexaoMySQL();
		ResultSet resultado= null;
		
		PreparedStatement query = null;
		try {
		 resultado=  query.executeQuery(LojaSql.SELECT_USUARIO_CPF);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(resultado != null) {
			existeCpf = true;
		}
		
		
		return existeCpf;
		
	}
	

}
