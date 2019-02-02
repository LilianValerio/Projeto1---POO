package br.com.codenation.aceleradev.rec.loja.bean;

import br.com.codenation.aceleradev.rec.loja.enums.CategoriaProduto;

public abstract class Produto {

    private Long id;
    private String descricao;
    private Double preco;
    private Double qtdEstoque;
    private CategoriaProduto categoria;

    public Produto(Long id, String descricao, Double preco, Double qtdEstoque, CategoriaProduto categoria) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Double qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }
}
