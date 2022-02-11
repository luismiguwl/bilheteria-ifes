package com.ifes.bilheteria.acessoadados;

import com.ifes.bilheteria.enums.Destino;
import java.util.List;
import org.apache.commons.csv.CSVRecord;

public class AcessoADados {
    public static String[] obterArrayDeStringDeDeterminadaColunaDoCSV(Destino destino, String coluna) {
        List<CSVRecord> records =  LeitorDeCSV.ler(destino);
        
        if (!encontrarColuna(records, coluna)) {
            throw new IllegalArgumentException(String.format("%s não é uma coluna do arquivo", coluna));
        }

        String[] linhas = new String[records.size()];
        for (int i = 0; i < linhas.length; i++) {
            linhas[i] = records.get(i).get(coluna);
        }
        
        return linhas;
    }
    
    private static boolean encontrarColuna(List<CSVRecord> records, String coluna) {
        return records.stream().anyMatch(record -> record.isMapped(coluna));
    }
    
}
