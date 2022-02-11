package com.ifes.bilheteria.acessoadados;

import com.ifes.bilheteria.entidades.*;
import com.ifes.bilheteria.enums.Destino;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class EscritorDeCSV {

    private Destino destino;

    public EscritorDeCSV(Destino destino) {
        this.destino = destino;
    }

    public void escreverEventoNoArquivoCSV(Evento evento) {
        PreenchedorDeDados dados = new PreenchedorDeDados(evento);
        List<Object> campos = dados.preencher();
        
        try {
            FileWriter out = new FileWriter(destino.get(), true);

            CSVPrinter csvPrinter = new CSVPrinter(out,
                    CSVFormat.DEFAULT
                            .withSkipHeaderRecord());

            csvPrinter.printRecord(campos);

            csvPrinter.flush();
            csvPrinter.close();
            out.close();
        } catch (IOException e) {
            System.out.println("ERRO AO ESCREVER ARQUIVO!");
            e.printStackTrace();
        }
    }
}
