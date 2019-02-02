package br.com.codenation.aceleradev.rec.loja.bean;

import java.util.ArrayList;
import java.util.List;

public class User {

    private static User instance;
    private Long id;
    private String nome;
    private String cpf;
    private List<Produto> carrinho;

    public User getInstance(Long id, String nome, String cpf){
        if(instance == null){
            instance = new User(id, nome, cpf);
        }
        return instance;
    }

    private User(Long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
<<<<<<< HEAD
        this.carrinho = new ArrayList<Produto>();
=======
        this.carrinho = new ArrayList();
>>>>>>> 1e482fc4b2f5cd822b4a1d9ea107eb66e764b737
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
