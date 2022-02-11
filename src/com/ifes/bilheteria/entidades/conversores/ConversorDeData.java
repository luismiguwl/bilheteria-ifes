package com.ifes.bilheteria.entidades.conversores;

import com.ifes.bilheteria.entidades.Data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConversorDeData {
    private String data;
    
    public ConversorDeData(String data) {
        this.data = data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public Data converterDataPadraoAmericanoParaBrasileiro() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = LocalDate.parse(data, formatter).format(formatter2);
        return Data.definirDiaMesEAnoBaseadoNumaString(dataFormatada);
    }
}
