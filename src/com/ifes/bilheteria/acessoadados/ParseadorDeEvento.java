package com.ifes.bilheteria.acessoadados;

import com.ifes.bilheteria.entidades.*;
import com.ifes.bilheteria.enums.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVRecord;

public class ParseadorDeEvento implements Parseavel<Evento> {
    
    @Override
    public List<Evento> obterLista() {
        List<CSVRecord> records = LeitorDeCSV.ler(Destino.EVENTOS_DISPONIVEIS);
        List<Evento> eventos = new ArrayList<>();
        
        for (CSVRecord record : records) {
            String nome = record.get("nome");
            
            Data dataDeInicio = Data.definirDiaMesEAnoBaseadoNumaString(record.get("dataDeInicio"));
            
            Categoria categoria = Categoria.valueOf(record.get("categoria").toUpperCase());
            
            int idDaCidade = Integer.parseInt(record.get("idDaCidade"));
            
            ParseadorDeCidade parseador = new ParseadorDeCidade();
            Cidade cidade = parseador.obterCidadeBaseadoNoID(idDaCidade);
            
            Horario horario = null;
            
            Evento evento = new Evento(nome, dataDeInicio, categoria, horario, cidade);
            eventos.add(evento);
        }
        
        return eventos;
    }
}
