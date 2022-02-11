package com.ifes.bilheteria.entidades;

import com.ifes.bilheteria.enums.Categoria;
import com.ifes.bilheteria.enums.ClassificacaoIndicativa;
import java.util.List;

public class Festival extends Evento {
    private List<String> atracoes;

    public Festival(String nome, Data dataDeInicio, Categoria categoria, Horario horario, Cidade cidade, ClassificacaoIndicativa classificacao, List<String> atracoes) {
        super(nome, dataDeInicio, categoria, horario, cidade, classificacao);
        this.atracoes = atracoes;
    }
    
    public List<String> getAtracoes() {
        return atracoes;
    }
}
