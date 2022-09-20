package com.company.walescko.cap12;

import java.util.Scanner;

public class Prog12B {

    public static void main(String[] args){

        String frase = "Linguagens de Alto Nível das antigas: Pascal e Cobol.";
        String resposta, hifens;
        Integer tamanhoResposta;

        Scanner scan = new Scanner(System.in);

        System.out.printf("\nConteúdo da frase: %s\n", frase);
        System.out.print("Qual o conteúdo que quer substituir? ");
        resposta = scan.next();
        tamanhoResposta = resposta.length();

        char[] substituicaoResposta = new char[tamanhoResposta];
        for (int i = 0; i < tamanhoResposta; i++){
            substituicaoResposta[i] = '-';
        }

        hifens = String.copyValueOf(substituicaoResposta);

        System.out.println(frase.replaceFirst(resposta, hifens));

    }
}
