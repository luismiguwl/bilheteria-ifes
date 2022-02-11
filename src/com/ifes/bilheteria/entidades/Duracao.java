package com.ifes.bilheteria.entidades;

public class Duracao {

    private int horas;
    private int minutos;

    public Duracao(int horas, int minutos) {
        this.horas = horas;
        definirMinuto(minutos);
    }

    public void definirMinuto(int minutos) {
        if (minutos >= 60) {
            horas += (minutos / 60);
            this.minutos = (minutos % 60);
        } else {
            this.minutos = minutos;
        }
    }

    public Duracao(int minutos) {
        definirHoraEMinuto(minutos);
    }
    
    public void definirHoraEMinuto(int minutos) {
        if (minutos < 60) {
            this.minutos = minutos;
        } else {
            horas = minutos / 60;
            this.minutos = (minutos % 60);
        }
    }

    public String getDuracaoFormatada() {
        if (possuiApenasUmMinuto()) {
            return "1 minuto";
        } else if (possuiMenosDeUmaHora()) {
            return String.format("%d minutos", minutos);
        } else if (possuiHoraExata()) {
            return String.format("%dh", horas);
        }

        return String.format("%dh %dm", horas, minutos);
    }

    public boolean possuiApenasUmMinuto() {
        return minutos == 1 && horas == 0;
    }

    public boolean possuiMenosDeUmaHora() {
        return minutos >= 1 && horas == 0;
    }

    public boolean possuiHoraExata() {
        return horas >= 1 && minutos == 0;
    }

    public int getDuracaoEmMinutos() {
        return (horas * 60) + minutos;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public static Duracao definirDuracaoBaseadoNumaString(String texto) {
        if (texto.equals("1 minuto")) {
            return new Duracao(1);
        } else if (texto.endsWith("minutos")) {
            return new Duracao(Integer.parseInt(texto.replace(" minutos", "")));
        } else if (texto.endsWith("h")) {
            return new Duracao(Integer.parseInt(texto.replace("h", "")));
        } else {
            String[] textosSeparadoPorEspaco = texto.split(" ");
            
            int horas = Integer.parseInt(textosSeparadoPorEspaco[0].replace("h", ""));
            int minutos = Integer.parseInt(textosSeparadoPorEspaco[1].replace("m", ""));
            
            return new Duracao(horas, minutos);
        }
    }
    
}
