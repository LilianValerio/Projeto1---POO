package br.com.codenation.aceleradev.rec.loja.bean;

import br.com.codenation.aceleradev.rec.loja.enums.CategoriaProduto;

public class Show extends Produto {

    private String artista;
    private String numeroMusicas;

    public Show(Long id, String descricao, Double preco, Double qtdEstoque, CategoriaProduto categoria,
                String artista, String numeroMusicas) {
        super(id, descricao, preco, qtdEstoque, categoria);
        this.artista = artista;
        this.numeroMusicas = numeroMusicas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getNumeroMusicas() {
        return numeroMusicas;
    }

    public void setNumeroMusicas(String numeroMusicas) {
        this.numeroMusicas = numeroMusicas;
    }
}
