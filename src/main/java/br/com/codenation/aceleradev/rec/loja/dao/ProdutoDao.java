package br.com.codenation.aceleradev.rec.loja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

import br.com.codenation.aceleradev.rec.loja.LojaSql;
import br.com.codenation.aceleradev.rec.loja.bean.Produto;
import br.com.codenation.aceleradev.rec.loja.conexaoBanco.ConexaoJDBC;
import br.com.codenation.aceleradev.rec.loja.enums.CategoriaProduto;
import br.com.codenation.aceleradev.rec.loja.interfaces.ProdutoInterface;

public class ProdutoDao implements ProdutoInterface{

	private static Connection conexao;
	
	public List<Produto> buscarPorCategoria(CategoriaProduto categoria) {
		
		conexao = new ConexaoJDBC().getConexaoMySQL(); 
		String sql = LojaSql.SELECT_PRODUTOS_CATEGORIA; 
		try {
			PreparedStatement statemant;
			statemant = conexao.prepareStatement(sql);
		}catch (Exception e) {
			
		}
		finally {
			ConexaoJDBC.fecharConexao();			
		}
		
		categoria.ordinal();
		
		
		return null;
	}

}
