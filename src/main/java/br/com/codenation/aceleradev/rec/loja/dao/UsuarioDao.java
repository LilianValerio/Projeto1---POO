package br.com.codenation.aceleradev.rec.loja.dao;

import br.com.codenation.aceleradev.rec.loja.conexaoBanco.ConexaoJDBC;

public class UsuarioDao {
	
	
	public Boolean validarCpf(String cpf) {
			
		Boolean existeCpf = false ;
		
		ConexaoJDBC conexao = new ConexaoJDBC();
		conexao.getConexaoMySQL();
		
		
		
		
		return existeCpf;
		
	}
	

}
