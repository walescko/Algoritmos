package com.company.walescko.cap03;
import java.util.Scanner;

import static java.lang.Math.*;

public class Exercicio0301 {

     public static void main(String[] args){

         Scanner scan = new Scanner(System.in);
         double y, z, x, a, b, c;

         System.out.println("Entre com três valores: ");
         x = scan.nextDouble();
         a = scan.nextDouble();
         b = scan.nextDouble();
         c = scan.nextDouble();

         y = (x + 3*b)/(2*x + c);
         z = (a*a + sqrt(3*b))/(5*pow(a,2));

     System.out.println("Os resultado são:  " + y + " e " + z);

     }
}
