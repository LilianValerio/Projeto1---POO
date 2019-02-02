package br.com.codenation.aceleradev.rec.loja.bean;

public class Produto {

    private Long id;
    private String descricao;
    private Double preco;
    private Double qtdEstoque;
    private Integer categoria;
    private String artista;
    private Integer qtdMusicas;
    private String diretor;
    private String anoLancamento;
    private String versao;
    private String requisitos;

    public Produto(Long id, String descricao, Double preco, Double qtdEstoque, Integer categoria, String artista,
                   Integer qtdMusicas, String diretor, String anoLancamento, String versao, String requisitos) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.categoria = categoria;
        this.artista = artista;
        this.qtdMusicas = qtdMusicas;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.versao = versao;
        this.requisitos = requisitos;
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

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getQtdMusicas() {
        return qtdMusicas;
    }

    public void setQtdMusicas(Integer qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
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

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }
}
