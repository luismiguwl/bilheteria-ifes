package com.ifes.bilheteria.acessoadados;

import com.ifes.bilheteria.entidades.Duracao;

public class ParseadorDeDuracao {

    public static String[] preencherArray(int maximo) {
        String[] duracoes = new String[maximo];
        int indice = 0;

        for (int i = 1; i <= maximo; i++) {
            Duracao duracao = new Duracao(i);
            duracoes[indice] = duracao.getDuracaoFormatada();
            indice++;
        }

        return duracoes;
    }
}
