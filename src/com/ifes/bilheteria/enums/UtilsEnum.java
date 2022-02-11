package com.ifes.bilheteria.enums;

import java.util.Arrays;

public class UtilsEnum {
    public static String[] obterListaContendoTextoDeCadaCategoria() {
        Categoria[] categorias = Categoria.values();
        String[] textos = new String[categorias.length];
        
        for (int i = 0; i < textos.length; i++) {
            textos[i] = categorias[i].get();
        }
        
        Arrays.sort(textos);
        return textos;
    }
    
    public static String[] obterListaContendoTextoDeCadaCategoria(Categoria... categoriasDesejadas) {
        String[] textos = new String[categoriasDesejadas.length];

        for (int i = 0; i < categoriasDesejadas.length; i++) {
            textos[i] = categoriasDesejadas[i].get();
        }
        
        Arrays.sort(textos);
        return textos;
    }
    
    public static String converterPrimeiraLetraEmMaiuscula(String nome) {
        String[] letras = nome.split("");
        letras[0] = letras[0].toUpperCase();
        return String.join("", letras);
    }
}
