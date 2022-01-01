package com.company.walescko.cap02;

import java.util.Scanner;

public class exercicio02_02 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double salario, novoSalario, percentulDeAumento, aumento;

        System.out.println("Aumento de salário");
        System.out.print("Digite o valor do salário do funcionario: R$ ");
        salario = scan.nextDouble();
        System.out.print("Digite o percentual de aumento em: ");
        percentulDeAumento = scan.nextDouble();

        novoSalario = salario*(1 + percentulDeAumento*0.01);

        System.out.printf("O salário novo do funcionário será R$ %.2f aumentando %.2f%%", novoSalario, percentulDeAumento);
    }
}
