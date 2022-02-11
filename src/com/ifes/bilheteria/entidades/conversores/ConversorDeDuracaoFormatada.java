package com.ifes.bilheteria.entidades.conversores;

import com.ifes.bilheteria.entidades.Duracao;
import com.ifes.bilheteria.entidades.validadores.ValidadorDeDuracao;

public class ConversorDeDuracaoFormatada {

    private String duracaoFormatada;

    public ConversorDeDuracaoFormatada(String duracaoFormatada) {
        this.duracaoFormatada = duracaoFormatada;
    }

    public Duracao converterStringFormatada() {
        ValidadorDeDuracao validador = new ValidadorDeDuracao(duracaoFormatada);
        
        if (validador.possuiApenasUmMinuto()) {
            return new Duracao(1);
        }
        
        if (validador.possuiMaisDeUmMinuto()) {
            String minutosString = duracaoFormatada.split(" minutos")[0];
            int minutos = Integer.parseInt(minutosString);
            return new Duracao(minutos);
        }
        
        if (validador.possuiHoraExata()) {
            String horasSemLetra = duracaoFormatada.replace("h", "");
            int horas = Integer.parseInt(horasSemLetra) * 60;
            return new Duracao(horas);
        }

        return converterHorasEMinutos();
    }
    
    private Duracao converterHorasEMinutos() {
        String[] duracaoSeparadaPorEspaco = duracaoFormatada.split(" ");
        
        String horasComTexto = duracaoSeparadaPorEspaco[0];
        String minutosComTexto = duracaoSeparadaPorEspaco[1];

        String horasSemTexto = horasComTexto.replace("h", "");
        String minutosSemTexto = minutosComTexto.replace("m", "");

        int horas = Integer.parseInt(horasSemTexto);
        int minutos = Integer.parseInt(minutosSemTexto);

        return new Duracao(horas, minutos);
    }
}
