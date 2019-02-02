package br.com.codenation.aceleradev.rec.loja.bean;

import java.util.List;

public class Carrinho {

    private User user;
    private List<Item> itens;

    public Carrinho(User user, List<Item> itens) {
        this.user = user;
        this.itens = itens;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
