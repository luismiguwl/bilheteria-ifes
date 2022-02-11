package com.ifes.bilheteria.utils;

import com.ifes.bilheteria.enums.Mes;
import java.util.Calendar;

public class UtilitarioDeData {

    public static int getDiaDoMesAtual() {
        return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    }
    
    public static Mes getMesAtual() {
        int numeroDoMes = Calendar.getInstance().get(Calendar.MONTH);
        return Mes.getMesPeloNumero(numeroDoMes + 1);
    }

}
