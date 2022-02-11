package com.ifes.bilheteria.entidades;

public class Horario {

    private int hora;
    private int minuto;

    public Horario(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    
    public Horario(String horario) {
        hora = Integer.parseInt(horario.split(":")[0]);
        minuto = Integer.parseInt(horario.split(":")[1]);
    }
    
    public String getHoraFormatada() {
        String horaString = formatarHorarioSeNecessario(Integer.toString(hora));
        String minutoString = formatarHorarioSeNecessario(Integer.toString(minuto));
        
        return String.format("%s:%s", horaString, minutoString);
    }

    private String formatarHorarioSeNecessario(String texto) {
        return FormatadorDeString.adicionarZeroAEsquerdaSeNecessario(texto);
    }

    public int getHora() {
        return hora;
    }
    
    public int getMinuto() {
        return minuto;
    }
    
    public static Horario definirHorarioBaseadoNumaString(String texto) {
        String horasTexto = texto.split(":")[0];
        String minutosTexto = texto.split(":")[1];
        return new Horario(Integer.parseInt(horasTexto), Integer.parseInt(minutosTexto));
    }
}
