package com.ifes.bilheteria.acessoadados;

import java.util.List;

public interface Parseavel<T> {
    List<T> obterLista();
}
