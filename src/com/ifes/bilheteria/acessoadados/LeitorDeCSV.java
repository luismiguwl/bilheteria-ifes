package com.ifes.bilheteria.acessoadados;

import com.ifes.bilheteria.enums.Destino;
import java.io.*;
import java.util.List;
import org.apache.commons.csv.*;

public class LeitorDeCSV {
    public static List<CSVRecord> ler(Destino destino) {
        try {
            Reader reader = new FileReader(destino.get());
            
            return CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .parse(reader)
                    .getRecords();
        } catch (IOException ex) {
            System.out.println("Arquivo não encontrado!");
            return null;
        }
    }
}
