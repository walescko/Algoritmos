package com.company.cap05;

import javax.swing.*;

public class QuadrilateroWin {

    public static void main(String[] args){

        int base, altura, area;
        String entrada;

        entrada = JOptionPane.showInputDialog("Digite o valor da base:");
        base = Integer.parseInt(entrada);

        entrada = JOptionPane.showInputDialog("Digite o valor da altura:");
        altura = Integer.parseInt(entrada);

        area = altura * base;

        JOptionPane.showMessageDialog(null, "Area do Quadrilatero = " + area, "Resultado", JOptionPane.PLAIN_MESSAGE);

    }
}
