package com.ifes.bilheteria.acessoadados;

import com.ifes.bilheteria.entidades.Cidade;
import com.ifes.bilheteria.enums.Destino;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVRecord;

public class ParseadorDeCidade implements Parseavel<Cidade> {

    @Override
    public List<Cidade> obterLista() {
        List<CSVRecord> records = LeitorDeCSV.ler(Destino.CIDADES);
        List<Cidade> cidades = new ArrayList<>();
        
        for (CSVRecord record : records) {
            int id = Integer.parseInt(record.get("id"));
            String nome = record.get("nome");
            
            cidades.add(new Cidade(id, nome));
        }
        
        return cidades;
    }
    
    public Cidade obterCidadeBaseadoNoID(int id) {
        List<CSVRecord> records = LeitorDeCSV.ler(Destino.CIDADES);
        List<Cidade> cidades = obterLista();

        for (Cidade cidade : cidades) {
            if (cidade.getId() == id) {
                return cidade;
            }
        }

        throw new IllegalArgumentException("ID não existe na lista de cidades");
    }
    
    public int obterIdDaCidadeBaseadoNoNome(String nome) {
        List<Cidade> cidades = obterLista();
        
        for (Cidade cidade : cidades) {
            if (nome.equals(cidade.getNome())) {
                return cidade.getId();
            }
        }
        
        String mensagemDeErro = String.format("Não foi possível encontrar o ID cidade %s", nome);
        throw new IllegalArgumentException(mensagemDeErro);
    }
    
    public static String[] preencherArray() {
        List<Cidade> cidades = new ParseadorDeCidade().obterLista();
        String[] textos = new String[cidades.size()];
        
        for (int i = 0; i < cidades.size(); i++) {
            textos[i] = cidades.get(i).getNome();
        }
        
        return textos;
    }

}
