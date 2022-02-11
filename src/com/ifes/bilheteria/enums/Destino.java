package com.ifes.bilheteria.enums;

public enum Destino {
    EVENTOS_DISPONIVEIS("dados/eventos-disponiveis.csv"),
    CIDADES("dados/cidades.csv"),
    CINEMAS("dados/cinemas.csv"),
    FILMES("dados/filmes.csv"),
    FESTIVAIS("dados/festivais.csv"),
    TEATRO("dados/teatros.csv");
    
    private String destino;
    
    private Destino(String destino) {
        this.destino = destino;
    }
    
    public String get() {
        return destino;
    }
}
