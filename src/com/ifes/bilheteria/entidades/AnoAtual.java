package com.ifes.bilheteria.entidades;

import java.util.Calendar;

public class AnoAtual {

    public static int get() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}
