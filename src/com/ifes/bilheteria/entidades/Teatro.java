package com.ifes.bilheteria.entidades;

import com.ifes.bilheteria.enums.*;

public class Teatro extends Evento {

    private Duracao duracao;
    private Genero genero;

    public Teatro(String nome, Data dataDeInicio, Categoria categoria, 
            Horario horario, Cidade cidade, 
            ClassificacaoIndicativa classificacao, 
            Duracao duracao, Genero genero) {
        super(nome, dataDeInicio, categoria, horario, cidade, classificacao);
        this.duracao = duracao;
        this.genero = genero;
    }

    public Duracao getDuracao() {
        return duracao;
    }

    public Genero getGenero() {
        return genero;
    }
    
    
}
