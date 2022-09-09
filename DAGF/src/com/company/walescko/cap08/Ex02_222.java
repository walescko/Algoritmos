package com.company.walescko.cap08;

import java.io.PrintStream;
import java.util.Scanner;

public class Ex02_222 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Integer eleitores, votaram = 0;
        int  voto;
        int acesso, encerramento = 0;
        int candidato01 = 0;
        int candidato02 = 0;
        int nulos = 0;
        int brancos = 0;
        int codeAbertura = 12345;
        int codeFechamento = 54321;

        System.out.println("Eleiçoes Municipais - Prefeito");
        System.out.print("Numero de eleitores: ");
        eleitores = scan.nextInt();

        do{
            System.out.print("Para iniciar a Sessão digite o código de liberação: ");
            acesso = scan.nextInt();
        } while(codeAbertura != acesso);

        System.out.println("Abertura da Urna valida!");
        System.out.println("Registro dos votos");
        do{
            System.out.println("Canditados a prefeito:");
            System.out.println("Buschinho........... 18");
            System.out.println("Logano ............. 22");
            System.out.println("Branco .............. 0");
            System.out.print("Qual o número do candidato? ");
            voto = scan.nextInt();

            switch (voto){
                case 18:
                    candidato01 += 1;
                    break;
                case 22:
                    candidato02 += 1;
                    break;
                case 0:
                    brancos += 1;
                    break;
                default:
                    nulos += 1;
            }

            votaram += 1;

            if (votaram == eleitores-1) {
                System.out.println("Falta apenas 1 eleitor para encerrar a votação.");
            } else {
                System.out.println("Deseja continuar? digite 777 e enter. ");
                System.out.printf("Se quiser encerrar a votação, digite o código de encerramento:");
                encerramento = scan.nextInt();
            }

            if (votaram == eleitores){
               encerramento = codeAbertura;

            }

        } while (encerramento != codeFechamento);

        float fvotaram = votaram.floatValue();
        float feleitores = eleitores.floatValue();
        float votaramPercentual = (fvotaram/feleitores) *100;
        System.out.println("Resultado das eleições:");
        System.out.printf("Total de eleitores ....... %s\n", eleitores);
        System.out.printf("Total de votantes ........ %s\n", votaram);
        System.out.printf("Buschinho (18) ........... %s\n", candidato01);
        System.out.printf("Logano (22) .............. %s\n", candidato02);
        System.out.printf("Brancos (0) .............. %s\n", brancos);
        System.out.printf("Nulos .................... %s\n", nulos);
        System.out.printf("Percentual de votantes ... %s\n", votaramPercentual);

    }
}
