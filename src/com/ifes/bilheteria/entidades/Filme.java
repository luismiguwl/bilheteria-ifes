package com.ifes.bilheteria.entidades;

import com.ifes.bilheteria.enums.Categoria;
import com.ifes.bilheteria.enums.ClassificacaoIndicativa;

public class Filme extends Evento {
    private Cinema cinema;
    private Duracao duracao;

    public Filme(String nome, Data dataDeInicio, Categoria categoria, Horario horario, Cidade cidade, ClassificacaoIndicativa classificacao, Cinema cinema, Duracao duracao) {
        super(nome, dataDeInicio, categoria, horario, cidade, classificacao);
        this.cinema = cinema;
        this.duracao = duracao;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public Duracao getDuracao() {
        return duracao;
    }

}
