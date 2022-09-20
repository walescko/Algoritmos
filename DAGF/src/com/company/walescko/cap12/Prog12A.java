package com.company.walescko.cap12;

import java.util.Scanner;

public class Prog12A {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String frase = "Este programa Java deve ser salvo como ProgX.java";

        System.out.println("\n" + frase);
        System.out.printf("\nNa posição 14 da frase temos a letra: %s\n", frase.charAt(14));

        boolean resposta = frase.endsWith("java");
        System.out.printf("\nA frase termina com a palavra java? %s", resposta);

        resposta = frase.startsWith("java");
        System.out.printf("\nA frase começa com a palavra java? %s", resposta);
        resposta = frase.startsWith("Java", 14);
        System.out.printf("\nA frase começa com a palava Java? %s", resposta);

        String frase01 = frase;
        System.out.println("\nConverte o conteúdo da frase para MAIÚSCULO");
        System.out.println(frase01.toUpperCase());
        System.out.println("\nConverte o conteúdo da frase para minúsculo");
        System.out.println(frase01.toLowerCase());

        System.out.printf("\nTamanho da String é %s", frase.length());
        System.out.printf("\nPosicaço da palavra Java na frase: %s", frase.indexOf("Java"));
        System.out.printf("\nPosicaço da palavra Java na frase: %s", frase.indexOf("JAVA"));
        System.out.printf("\nPosicaço da palavra Java na frase: %s", frase.indexOf("java"));
        System.out.printf("\nPosicaço da palavra Java na frase: %s", frase.lastIndexOf("."));

        String frase02 = frase.substring(14,44);
        System.out.printf("\nPalavras contidas entre as posições 14 e 44 na frase é: %s", frase02);

        frase02 = frase.replaceAll("ProgX", "-----");
        System.out.printf("%s", frase02);

        frase02 = frase;
        System.out.printf("\nFrase é igual Frase02? %s", frase.equalsIgnoreCase(frase02));
        System.out.printf("\nComprara frase com Frase02: %s", frase.compareTo(frase02));
        System.out.printf("\nFrase contém a palavra programa: %s", frase.contains("programa"));

    }
}
