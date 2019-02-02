package br.com.codenation.aceleradev.rec.loja.interfaces;

import java.util.List;

import br.com.codenation.aceleradev.rec.loja.bean.Produto;
import br.com.codenation.aceleradev.rec.loja.enums.CategoriaProduto;

public interface ProdutoInterface {

	public List<Produto> buscarPorCategoria(CategoriaProduto categoria);

	public boolean inserirProdutoNoCarrinho(Long idProduto);


}
