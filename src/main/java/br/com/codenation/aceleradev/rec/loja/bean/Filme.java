package br.com.codenation.aceleradev.rec.loja.bean;

import br.com.codenation.aceleradev.rec.loja.enums.CategoriaProduto;

public class Filme extends Produto {

    private String diretor;
    private String anoLancamento;

    public Filme(Long id, String descricao, Double preco, Double qtdEstoque,
                 CategoriaProduto categoria, String diretor, String anoLancamento) {
        super(id, descricao, preco, qtdEstoque, categoria);
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
