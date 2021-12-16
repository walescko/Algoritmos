package com.company.cap11;

import java.util.*;
import java.lang.*;

public class Prog11 {

    public static void telaEntrada(){

        System.out.println("Calculadora Aritimética");
        System.out.println("Soma ............: +");
        System.out.println("Subtração .......: -");
        System.out.println("Multiplicação ...: *");
        System.out.println("Divisão .........: /");
        System.out.println("Fim .............: F");
        System.out.print("Escolha uma opcao: ");
    }

    public static float Calcular(char suaOpcao, float numero1, float numero2) {

        float numero3 = 0;
        switch (suaOpcao) {
            case '+':
                numero3 = numero1 + numero2;
                break;
            case '-':
                numero3 = numero1 - numero2;
                break;
            case '*':
                numero3 = numero1 * numero2;
                break;
            case '/':
                numero3 = numero1 / numero2;
                break;
        }
        return numero3;
    }

    public static void main(String[] args){

        String entrada;
        char suaOpcao;
        float numero1, numero2, numero3;

        suaOpcao = ' ';
        while (suaOpcao != 'F' && suaOpcao != 'f') {
            telaEntrada();
            Scanner scan = new Scanner(System.in);

            entrada = scan.next();
            suaOpcao = entrada.charAt(0);

            if (suaOpcao != 'F' && suaOpcao != 'f') {
                if (suaOpcao == '+' || suaOpcao == '-' || suaOpcao == '*' || suaOpcao == '/') {
                    System.out.print("Informe o primeiro numero: ");
                    numero1 = scan.nextFloat();
                    System.out.print("Informe o segundo numero: ");
                    numero2 = scan.nextFloat();
                    System.out.println("Resultado = " + Calcular(suaOpcao, numero1, numero2));
                } else {
                    System.out.println("Opcao Invalida!");
                }
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("Nenhuma excessão");
                }
            }
        }

    }

}