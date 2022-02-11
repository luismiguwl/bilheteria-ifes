package com.ifes.bilheteria.enums;

public enum ClassificacaoIndicativa {
    LIVRE("Livre"),
    DEZ_ANOS(10),
    DOZE_ANOS(12), 
    QUATORZE_ANOS(14), 
    DEZESSEIS_ANOS(16), 
    DEZOITO_ANOS(18);
    
    private int idade;
    private String nome;
    
    private ClassificacaoIndicativa(int idade) {
        this.idade = idade;
    }
    
    private ClassificacaoIndicativa(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getValor() {
        if (nome != null) {
            return nome;
        }
        
        return Integer.toString(idade);
    }
    
    public boolean livre() {
        return this.equals(LIVRE);
    }
    
    public static ClassificacaoIndicativa definirClassificacaoBaseadaNaIdade(int idade) {
        ClassificacaoIndicativa[] classificacoes = ClassificacaoIndicativa.values();
        
        for (ClassificacaoIndicativa classificacao : classificacoes) {
            if (classificacao.getIdade() == idade) {
                return classificacao;
            }
        }
        
        String mensagemDeErro = String.format("%d não é uma idade válida", idade);
        throw new IllegalArgumentException(mensagemDeErro);
    }
}
