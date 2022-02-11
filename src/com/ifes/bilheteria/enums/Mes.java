package com.ifes.bilheteria.enums;

public enum Mes {
    JANEIRO(31),
    FEVEREIRO(28),
    MARCO(31),
    ABRIL(30),
    MAIO(31),
    JUNHO(30),
    JULHO(31),
    AGOSTO(31),
    SETEMBRO(30),
    OUTUBRO(31),
    NOVEMBRO(30),
    DEZEMBRO(31);

    private int quantidadeDeDias;

    private Mes(int quantidadeDeDias) {
	this.quantidadeDeDias = quantidadeDeDias;
    }

    public String getNome() {
        String nomeMinusculo = name().toLowerCase();
        return UtilsEnum.converterPrimeiraLetraEmMaiuscula(nomeMinusculo);
    }
    
    public int getQuantidadeDeDias() {
        return quantidadeDeDias;
    }
    
    public static Mes getMesPeloNumero(int numero) {
        for (Mes mes : Mes.values()) {
            if ((mes.ordinal() + 1) == numero) {
                return mes;
            }
        }
        
        throw new IllegalArgumentException(String.format("%d não é o número de um mês", numero));
    }
    
    public static int getNumeroDoMes(Mes mes) {
        return mes.ordinal() + 1;
    }
    
    public static String[] obterListaDeMesesPersonalizada() {
        Mes[] meses = Mes.values();
        String[] mesesPersonalizados = new String[meses.length];
        
        for (int i = 0; i < mesesPersonalizados.length; i++) {
            String nomeEnum = meses[i].name();
            nomeEnum = nomeEnum.toLowerCase();
            nomeEnum = UtilsEnum.converterPrimeiraLetraEmMaiuscula(nomeEnum);
            mesesPersonalizados[i] = nomeEnum;
        }
        
        return mesesPersonalizados;
    }
}
