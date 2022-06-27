package com.company.walescko.cap02;

import java.util.*;

public class Exercicio0201 {

    public static void  main(String[] args){

        int x, y, z;
        Scanner scan;

        scan = new Scanner(System.in);
        System.out.println("Entre com dois valores inteiros: ");
        x = scan.nextInt();

        y = scan.nextInt();

        z = x + y;

        System.out.println("Soma = " + z);

    }
}
