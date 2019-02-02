package br.com.codenation.aceleradev.rec.loja.bean;

import br.com.codenation.aceleradev.rec.loja.enums.CategoriaProduto;

public class Software extends Produto{

    private String versao;
    private String requisitosSistema;

    public Software(Long id, String descricao, Double preco, Double qtdEstoque,
                    CategoriaProduto categoria, String versao, String requisitosSistema) {
        super(id, descricao, preco, qtdEstoque, categoria);
        this.versao = versao;
        this.requisitosSistema = requisitosSistema;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getRequisitosSistema() {
        return requisitosSistema;
    }

    public void setRequisitosSistema(String requisitosSistema) {
        this.requisitosSistema = requisitosSistema;
    }
}
