package com.ifes.bilheteria.acessoadados;

import com.ifes.bilheteria.enums.Genero;

public class ParseadorDeGenero {
    public static String[] preencherArray() {
        Genero[] generos = Genero.values();
        String[] textos = new String[generos.length];
        
        for (int i = 0; i < textos.length; i++) {
            textos[i] = generos[i].getNome();
        }
        
        return textos;
    }
}
