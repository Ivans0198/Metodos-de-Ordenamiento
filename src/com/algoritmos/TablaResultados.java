package com.algoritmos;

import javax.swing.*;

public class TablaResultados {

    JFrame jFrame;
    JTable jTable;

    public TablaResultados(String[][] data) {
        jFrame = new JFrame();
        jFrame.setTitle("Resultados");
        String[] columnNames = {"Método de Ordenamiento", "Nanosegundos", "Milisegundos", "Segundos"};
        jTable = new JTable(data, columnNames);
        jTable.setBounds(110, 140, 200, 300);

        JScrollPane sp = new JScrollPane(jTable);
        jFrame.add(sp);
        jFrame.setSize(500, 200);
        jFrame.setVisible(true);
    }
}

