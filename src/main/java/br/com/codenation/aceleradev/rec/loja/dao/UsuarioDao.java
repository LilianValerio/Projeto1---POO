package br.com.codenation.aceleradev.rec.loja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.codenation.aceleradev.rec.loja.LojaSql;
import br.com.codenation.aceleradev.rec.loja.bean.User;
import br.com.codenation.aceleradev.rec.loja.conexaoBanco.ConectionFactory;
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
	
	public boolean validarCpf(String cpf) throws CpfInvalidoException, SQLException {

		Connection conexao = ConectionFactory.getConexaoMySQL();
		ResultSet resposta;
		PreparedStatement statement;
		try {
			statement = conexao.prepareStatement(LojaSql.SELECT_USUARIO_CPF);
			statement.setString(1, cpf);

			resposta = statement.executeQuery();

			if(resposta.next()){
				User usuario = User.getInstance();
				usuario.setCpf(resposta.getString("cpf"));
				usuario.setId(resposta.getInt("id"));
				usuario.setNome(resposta.getString("nome"));
			}else {
				throw new CpfInvalidoException();
			}

		} catch (SQLException e) {
			throw e;
		}

		return true;
		
	}
	

}
