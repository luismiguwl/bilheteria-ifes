package com.ifes.bilheteria.enums;

public enum Coluna {
    NOME("nome"),
    DATA_DE_INICIO("dataDeInicio"),
    HORARIO("horario"),
    CLASSIFICACAO_INDICATIVA("classificacaoIndicativa"),
    ID_CIDADE("idDaCidade"),
    ATRACOES("atracoes"),
    ID_CINEMA("idDoCinema");
    
    private String coluna;
    
    private Coluna(String coluna) {
        this.coluna = coluna;
    }
    
    public String getNome() {
        return coluna;
    }
}
