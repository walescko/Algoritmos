package com.company.walescko.cap05;

import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.PI;

public class Ex04_148 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.0000");

        double angleDegree, angleRad, cosRad, sinRad, tanRad;

        System.out.println("Exercicio 04 - página 148");
        System.out.print("Entre com o valor do angulo em graus: ");
        angleDegree = scan.nextDouble();

        angleRad = angleDegree*PI/180;
        cosRad = Math.cos(angleRad);
        sinRad = Math.sin(angleRad);
        tanRad = Math.tan(angleRad);

        System.out.println("Angulo: " + df.format(angleDegree)+ "º.");
        System.out.println("sen("+df.format(angleDegree)+"º) = " +df.format(sinRad));
        System.out.println("cos("+df.format(angleDegree)+"º) = " +df.format(cosRad));
        System.out.println("tan("+df.format(angleDegree)+"º) = " +df.format(tanRad));

    }
}
