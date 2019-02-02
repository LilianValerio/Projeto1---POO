package br.com.codenation.aceleradev.rec.loja.business;

import br.com.codenation.aceleradev.rec.loja.bean.Produto;
import br.com.codenation.aceleradev.rec.loja.dao.ProdutoDao;
import br.com.codenation.aceleradev.rec.loja.enums.CategoriaProduto;
import br.com.codenation.aceleradev.rec.loja.interfaces.ProdutoInterface;

import java.util.List;

public class ProdutoBuisness implements ProdutoInterface {

    @Override
    public List<Produto> buscarPorCategoria(CategoriaProduto categoria) {
        return ProdutoDao.buscarPorCategoria(categoria);
    }

    @Override
    public boolean inserirProdutoNoCarrinho(Long idProduto) {

        return true;
    }

}
