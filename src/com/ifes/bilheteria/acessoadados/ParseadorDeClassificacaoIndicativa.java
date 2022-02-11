package com.ifes.bilheteria.acessoadados;

import com.ifes.bilheteria.enums.ClassificacaoIndicativa;

public class ParseadorDeClassificacaoIndicativa {
    public static String[] preencherArray() {
        ClassificacaoIndicativa[] classificacoesIndicativas = ClassificacaoIndicativa.values();
        String[] textos = new String[classificacoesIndicativas.length];

        for (int i = 0; i < textos.length; i++) {
            textos[i] = classificacoesIndicativas[i].getValor();
        }
        
        return textos;
    }
}
