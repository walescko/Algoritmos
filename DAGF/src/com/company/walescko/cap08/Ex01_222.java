package com.company.walescko.cap08;

import java.util.Scanner;
import static java.lang.StrictMath.pow;

public class Ex01_222 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        double soma = 0;

        System.out.println("Entre com dois valores:");
        System.out.print("a = ");
        a = scan.nextInt();
        System.out.print("b = ");
        b = scan.nextInt();

        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= b; j++){
                soma = soma + (a*b)+pow(j+i,2);
            }
        }
        System.out.printf("Soma = %s", soma);
    }
}
