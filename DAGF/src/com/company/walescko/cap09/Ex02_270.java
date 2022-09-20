package com.company.walescko.cap09;

import java.util.Scanner;

public class Ex02_270 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = 10;
        String[] vector01 = new String[n];
        String[] vector02 = new String[n];

        System.out.println("Vetores  e soma de vetores");
        System.out.println("Digite os elementos do primeiro vetor");
        for(int i = 0; i < n; i++){
            System.out.printf("Elemento %s ", i+1);
            vector01[i] = scan.next();
        }

        System.out.println("Digite os elementos do segundo vetor");
        for(int i = 0; i < n; i++){
            System.out.printf("Elemento %s ", i+1);
            vector02[i] = scan.next();
        }


    }
}
