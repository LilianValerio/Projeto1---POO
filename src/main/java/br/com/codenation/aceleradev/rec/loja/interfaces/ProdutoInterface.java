package br.com.codenation.aceleradev.rec.loja.interfaces;

import java.util.List;

import br.com.codenation.aceleradev.rec.loja.bean.Produto;
import br.com.codenation.aceleradev.rec.loja.enums.CategoriaProduto;

public interface ProdutoInterface {

	List<Produto> buscarPorCategoria(CategoriaProduto categoria);
}
