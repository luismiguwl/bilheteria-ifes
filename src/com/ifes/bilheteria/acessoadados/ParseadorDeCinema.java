package com.ifes.bilheteria.acessoadados;

import com.ifes.bilheteria.entidades.*;
import com.ifes.bilheteria.enums.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVRecord;

public class ParseadorDeCinema implements Parseavel<Cinema> {

    @Override
    public List<Cinema> obterLista() {
        List<CSVRecord> records = LeitorDeCSV.ler(Destino.CINEMAS);
        List<Cinema> cinemas = new ArrayList<>();
        
        for (CSVRecord record : records) {
            int id = Integer.parseInt(record.get("id"));
            String nome = record.get("nome");
            
            int idDaCidade = Integer.parseInt(record.get("idDaCidade"));
            Cidade cidade = new ParseadorDeCidade().obterCidadeBaseadoNoID(idDaCidade);
            
            cinemas.add(new Cinema(id, nome, cidade));
        }
        
        return cinemas;
    }
    
}
