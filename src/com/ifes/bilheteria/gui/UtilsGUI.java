package com.ifes.bilheteria.gui;

import com.ifes.bilheteria.entidades.Duracao;
import com.ifes.bilheteria.enums.ClassificacaoIndicativa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class UtilsGUI {

    public static void renderizarTabela(JTable tabela, JScrollPane scrollPane, Object[][] dados, String... colunas) {
        tabela.setModel(new javax.swing.table.DefaultTableModel(
                dados, colunas
        ));

        scrollPane.setViewportView(tabela);
    }
    
    public static void renderizarTabela(JTable tabela, JScrollPane scrollPane, String... colunas) {
        tabela.setModel(new javax.swing.table.DefaultTableModel(
                null, colunas
        ));

        scrollPane.setViewportView(tabela);
    }

    public static void renderizarJComboBox(JComboBox comboBox, String... opcoes) {
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(opcoes));
    }
    
    public static void centralizarTelaNoMeio(JFrame tela) {
        tela.setLocationRelativeTo(null);
    }
    
    public static String[] adicionarCaracterNaPrimeiraPosicaoDoArray(String caracter, String... array) {
        String[] novoArray = new String[array.length + 1];

        novoArray[0] = caracter;
        for (int i = 1; i < novoArray.length; i++) {
            novoArray[i] = array[i - 1]; 
        }
        
        return novoArray;
    }
    
    public static String[] popularArrayDeString(int inicio, int fim) {
        List<String> valores = new ArrayList<>();
        
        for (int i = inicio; i <= fim; i++) {
            valores.add(Integer.toString(i));
        }
        
        return valores.toArray(new String[0]);
    }
    
    public static String obterItemSelecionadoConvertidoEmString(JComboBox comboBox) {
        return comboBox.getSelectedItem().toString();
    }
    
    public static void deixarJanelaVisivelCasoEstejaInvisivel(JFrame janela) {
        if (!janela.isVisible()) {
            janela.setVisible(true);
        }
    }
    
    public static void exibirMensagemNaTela(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static ClassificacaoIndicativa definirClassificacaoIndicativa(JComboBox comboBox) {
        String classificacaoSelecionada = obterItemSelecionadoConvertidoEmString(comboBox);
        
        if (classificacaoSelecionada.equals("Livre")) {
            return ClassificacaoIndicativa.LIVRE;
        }
        
        return ClassificacaoIndicativa.definirClassificacaoBaseadaNaIdade(Integer.parseInt(classificacaoSelecionada));
    }
    
}
