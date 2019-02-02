package br.com.codenation.aceleradev.rec.loja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import br.com.codenation.aceleradev.rec.loja.LojaSql;
import br.com.codenation.aceleradev.rec.loja.bean.Produto;
import br.com.codenation.aceleradev.rec.loja.conexaoBanco.ConectionFactory;
import br.com.codenation.aceleradev.rec.loja.enums.CategoriaProduto;

public class ProdutoDao{

	private static ProdutoDao instance;
	private static Connection conexao;

	private ProdutoDao() {

	}

	public static ProdutoDao getInstance(){
		if(instance == null){
			instance = new ProdutoDao();
		}
		return instance;
	}

	public static List<Produto> buscarPorCategoria(CategoriaProduto categoria) {
		
		conexao = new ConectionFactory().getConexaoMySQL();
		String sql = LojaSql.SELECT_PRODUTOS_CATEGORIA; 
		try {
			PreparedStatement statemant;
			statemant = conexao.prepareStatement(sql);
		}catch (Exception e) {
			
		}
		finally {
			ConectionFactory.fecharConexao();
		}
		
		categoria.ordinal();

		return null;
	}

}
