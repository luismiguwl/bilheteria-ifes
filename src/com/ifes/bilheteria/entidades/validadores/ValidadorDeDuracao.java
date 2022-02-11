package com.ifes.bilheteria.entidades.validadores;

public class ValidadorDeDuracao {
    private String duracao;
    
    public ValidadorDeDuracao(String duracao) {
        this.duracao = duracao;
    }
    
    public boolean possuiHoraExata() {
        return duracao.endsWith("h");
    }

    public boolean possuiMaisDeUmMinuto() {
        return duracao.endsWith("minutos");
    }

    public boolean possuiApenasUmMinuto() {
        return duracao.equals("1 minuto");
    }
}
