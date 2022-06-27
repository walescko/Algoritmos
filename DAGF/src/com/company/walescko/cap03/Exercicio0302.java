package com.company.walescko.cap03;
//import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

class Exercicio0302{
    public static void main(String args[]){

        double a,b,c;
        double delta;
        double x1, x2;
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");

        System.out.println();
        System.out.println("WADAJU SOFTWARE SOLUTIONS");
        System.out.println("Equação do II Grau - Raízes");
        System.out.println();
        System.out.println("Entre com o valor dos coeficientes da Equação Quadrática:");
        System.out.print("a = ");
        a = s.nextDouble();
        System.out.print("b = ");
        b = s.nextDouble();
        System.out.print("c = ");
        c = s.nextDouble();

        delta = b*b - 4 * a * c;
        System.out.println("Delta = " + df.format(delta));
        System.out.println();
        //raízes da equacao
        if ((a == 0) || (delta < 0 )){
            System.out.println("Não tem raízes reais!");
        } else {

            if (delta == 0 ){
                x1 = -b/(2*a);
                System.out.println("A equação tem duas raízes reais idênticas X1 = X2 = "+df.format(x1));
            } else {
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("A equação tem duas raízes reais distintas X1 = "+df.format(x1)+" e X2 = "+df.format(x2));
            }
        }
      // vértice da parábola
        double xv, yv;
        xv = (-b)/(2*a);
        yv = -delta/(4*a);

        System.out.println("O vértice da parabóla é Xv = "+df.format(xv)+ " e Yv = "+df.format(yv));

        System.out.println("\nfim\n");
    }
}