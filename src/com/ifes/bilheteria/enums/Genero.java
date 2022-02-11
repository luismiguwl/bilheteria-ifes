package com.ifes.bilheteria.enums;

public enum Genero {
    COMEDIA("Comedia"),
    DRAMA("Drama"),
    FARSA("Farsa"),
    MIMICA("Mimica"),
    MELODRAMA("Melodrama");

    private String nome;

    private Genero(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
