package com.ifes.bilheteria.enums;

public enum Categoria {
    TEATRO("Teatro"), FESTIVAL("Festival"), FILME("Filme"), TODAS("Todas");
    
    private String categoria;
    
    private Categoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String get() {
        return categoria;
    }
    
    public static String[] obterCategoriasEmArrayDeString() {
        Categoria[] categorias = Categoria.values();
        String[] strings = new String[categorias.length];
        
        for (int i = 0; i < strings.length; i++) {
            strings[i] = categorias[i].get();
        }
        
        return strings;
    }
    
    public static String[] obterCategoriasEmArrayDeStringExceto(Categoria categoria) {
        Categoria[] categorias = Categoria.values();
        String[] strings = new String[categorias.length - 1];
        
        for (int i = 0; i < strings.length; i++) {
            if (!categorias[i].equals(categoria)) {
                strings[i] = categorias[i].get();
            }
        }
        
        return strings;
    }
    
}
