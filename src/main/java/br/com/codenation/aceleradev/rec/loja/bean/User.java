package br.com.codenation.aceleradev.rec.loja.bean;

import java.util.ArrayList;
import java.util.List;

public class User {

    private static User instance;
    private Integer id;
    private String nome;
    private String cpf;
    private Carrinho carrinho;

    public static User getInstance(){
        if(instance == null){
            instance = new User();
        }
        return instance;
    }

    private User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
