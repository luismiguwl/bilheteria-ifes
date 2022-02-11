package com.ifes.bilheteria.gui.cadastro;

import javax.swing.JTextField;

public class ValidadorDeCampos {
    public boolean camposPossuemAlgumTexto(JTextField... campos) {
        for (JTextField campo : campos) {
            if (campo.getText().isEmpty() || campo.getText().isBlank()) {
                return false;
            }
        }
        
        return true;
    }
}
