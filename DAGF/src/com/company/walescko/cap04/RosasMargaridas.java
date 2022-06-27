package com.company.walescko.cap04;
import java.util.Scanner;

public class RosasMargaridas {
    public static void main(String[] args){
        double valor, rosas, margaridas, diferenca;
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor do buquê em R$ ? ");
        valor = scan.nextDouble();
        System.out.println("Qual o valor da diferença entre rosas e margaridas em R$? ");
        diferenca = scan.nextDouble();

        rosas = (valor - diferenca*4)/10;
        margaridas = rosas + diferenca;

        System.out.println("O valor da rosa é R$ " + rosas);
        System.out.println("O valor da margarida é R$ " + margaridas);
    }
}
