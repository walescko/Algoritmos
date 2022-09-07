package com.company.walescko.cap06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03_170 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.000");

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
            System.out.println("A solução do sistema é :");
            x = (c*e - b*f)/denominador;
            y = (a*f - c*d)/denominador;
            System.out.println("x = " + df.format(x));
            System.out.println("y = " + df.format(y));
        }
    }
}