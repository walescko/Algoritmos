package com.company.walescko.cap05;

import javax.swing.*;

public class EntradaDadosWin {

    public static void main(String[] args){

        String entrada;
        int numero;

        entrada = JOptionPane.showInputDialog("Digite um numero inteiro:");
        numero = Integer.parseInt(entrada);

        JOptionPane.showMessageDialog(null, "Numero digitado = " + numero, "Mensagem", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
