package com.ifes.bilheteria.entidades;

public class Cinema {

    private int id;
    private String nome;
    private Cidade cidade;
    
    public Cinema(int id, String nome, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

}
