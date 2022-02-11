package com.ifes.bilheteria.entidades;

import com.ifes.bilheteria.entidades.conversores.ConversorDeData;
import com.ifes.bilheteria.enums.Mes;
import static com.ifes.bilheteria.entidades.FormatadorDeString.*;

public class Data {

    private int dia;
    private Mes mes;
    private int ano;

    public Data(int dia, Mes mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Data(String dataFormatada) {
        dia = Integer.parseInt(dataFormatada.split("/")[0]);
        mes = Mes.getMesPeloNumero(Integer.parseInt(dataFormatada.split("/")[1]));
        ano = Integer.parseInt(dataFormatada.split("/")[2]);
    }

    public String getDataFormatada() {
        String diaString = adicionarZeroAEsquerdaSeNecessario(Integer.toString(dia));
        String mesString = adicionarZeroAEsquerdaSeNecessario(Integer.toString(mes.getNumeroDoMes(mes)));
        String anoString = adicionarZeroAEsquerdaSeNecessario(Integer.toString(ano));

        return String.format("%s/%s/%s", diaString, mesString, anoString);
    }

    public static Data definirDiaMesEAnoBaseadoNumaString(String texto) {
        if (texto.contains("/")) {
            int dia = Integer.parseInt(texto.split("/")[0]);

            int numeroDoMes = Integer.parseInt(texto.split("/")[1]);
            Mes mes = Mes.getMesPeloNumero(numeroDoMes);

            int ano = Integer.parseInt(texto.split("/")[2]);

            return new Data(dia, mes, ano);
        }

        ConversorDeData conversor = new ConversorDeData(texto);
        return conversor.converterDataPadraoAmericanoParaBrasileiro();
    }
}
