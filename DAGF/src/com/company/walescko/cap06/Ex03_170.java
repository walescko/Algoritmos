package com.company.walescko.cap06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03_170 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double a, b, c, d, e, f, x, y;
        double denominador;

        System.out.println("Sistema Linear de duas equaçoes, tipo:");
        System.out.println("ax + by = c");
        System.out.println("dx + ey = f");

        System.out.println("Entre com o valor dos coeficentes:");
        System.out.print("a = ");
        a = scan.nextDouble();
        System.out.print("b = ");
        b = scan.nextDouble();
        System.out.print("c = ");
        c = scan.nextDouble();
        System.out.print("d = ");
        d = scan.nextDouble();
        System.out.print("e = ");
        e = scan.nextDouble();
        System.out.print("f = ");
        f = scan.nextDouble();

        denominador = a*e - d*d;

        if (denominador == 0){
            System.out.println("Sistema sem solução");
        } else {
            System.out.printf("%s x + %s y = %s", a, b, c);
            System.out.printf("%s x +  %s y = %s", d, e, f);
            System.out.println("A solução do sistema é :");
            x = (c*e - b*f)/denominador;
            y = (a*f - c*d)/denominador;
            System.out.printf("x = %s", x);
            System.out.printf("y = %s", y);
        }
    }
}
