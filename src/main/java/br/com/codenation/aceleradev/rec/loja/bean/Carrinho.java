package br.com.codenation.aceleradev.rec.loja.bean;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private Long user;
    private List<Item> itens;

    public Carrinho(Long user) {
        this.user = user;
        this.itens = new ArrayList<Item>();
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
