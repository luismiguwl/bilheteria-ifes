package com.ifes.bilheteria.entidades.validadores;

public class ValidadorDeAnoBissexto {

    private int ano;

    public ValidadorDeAnoBissexto(int ano) {
        this.ano = ano;
    }

    public boolean ehBissexto() {
        return ehMultiploDe(4) && !ehMultiploDe(100) || ehMultiploDe(400);
    }

    private boolean ehMultiploDe(int numero) {
        return ano % numero == 0;
    }

}
