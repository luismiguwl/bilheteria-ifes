package com.ifes.bilheteria.entidades;

import com.ifes.bilheteria.enums.Categoria;
import com.ifes.bilheteria.enums.ClassificacaoIndicativa;

public class Evento {

    private String nome;
    private Data dataDeInicio;
    private Categoria categoria;
    private Horario horario;
    private Cidade cidade;
    private ClassificacaoIndicativa classificacaoIndicativa;

    public Evento(String nome, Data dataDeInicio, Categoria categoria, Horario horario, Cidade cidade) {
        this.nome = nome;
        this.dataDeInicio = dataDeInicio;
        this.categoria = categoria;
        this.horario = horario;
        this.cidade = cidade;
    }
    
    public Evento(String nome, Data dataDeInicio, Categoria categoria, Horario horario, Cidade cidade, ClassificacaoIndicativa classificacao) {
        this.nome = nome;
        this.dataDeInicio = dataDeInicio;
        this.categoria = categoria;
        this.horario = horario;
        this.cidade = cidade;
        this.classificacaoIndicativa = classificacao;
    }

    public String getNome() {
        return nome;
    }

    public Data getDataDeInicio() {
        return dataDeInicio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Horario getHorario() {
        return horario;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public ClassificacaoIndicativa getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }
    
    @Override
    public String toString() {
        return "Evento{" + "nome=" + nome + ", dataDeInicio=" + dataDeInicio + ", dataDeTermino=" + ", categoria=" + categoria + ", horario=" + horario + ", cidade=" + cidade + '}';
    }

}
