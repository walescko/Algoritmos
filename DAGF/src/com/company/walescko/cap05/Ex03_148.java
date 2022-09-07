package com.company.walescko.cap05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03_148 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");

        double celsius, fahrenheit;
        System.out.println("Exercío 03, página 148");
        System.out.print("Entre com o valor da temperatura em Celsius: ");
        celsius = scan.nextDouble();

        fahrenheit = 1.8*celsius + 32;

        System.out.println("Temperatura em Celsius " + df.format(celsius) + "C.");
        System.out.println("Temperatura em Fahrenheit " + df.format(fahrenheit) + "F.");
    }
}
