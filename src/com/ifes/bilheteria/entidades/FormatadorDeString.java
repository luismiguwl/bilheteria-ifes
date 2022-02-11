package com.ifes.bilheteria.entidades;

import java.util.List;
import java.util.stream.Collectors;

public class FormatadorDeString {
    public static String adicionarZeroAEsquerdaSeNecessario(String numero) {
        return numero.length() < 2 ? "0" + numero : numero;
    }
    
    public static String unirElementosDeUmaListaSeparandoPorVirgula(List<String> lista) {
        return lista.stream()
                .collect(Collectors.joining(", "));
    }
}
