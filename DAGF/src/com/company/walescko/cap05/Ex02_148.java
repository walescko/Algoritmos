package com.company.walescko.cap05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02_148 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");

        double productPrice, discount, finalPrice;

        System.out.println("Exercio 2 - Página 148");
        System.out.print("Entre com o preço do produto: ");
        productPrice = scan.nextDouble();
        System.out.print("Entre com o valor de desconto em %: ");
        discount = scan.nextDouble();

        finalPrice = productPrice*(1-(discount/100));

        System.out.println("Preço do produto R$ " + df.format(productPrice));
        System.out.println("Desconto: " + df.format(discount));
        System.out.println("Preço final com Desconto R$ "+ df.format(finalPrice));

    }
}
