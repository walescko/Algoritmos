package com.company.cap10;

import java.util.Scanner;

public class Prog_10 {

    public static void main(String [] args){

        String vetNomeAluno[];
        double matNotas[][];
        int contadorAlunos;
        double acumulaMedia = 0, mediaTurma;

        Scanner scan = new Scanner(System.in);

        vetNomeAluno = new String[10];
        matNotas = new double[10][3];

        System.out.println("");
        System.out.println("Processa a média final de 10 alunos");

        for (contadorAlunos = 0; contadorAlunos <10; contadorAlunos++ ){ //aqui declararia o contador dentro do loop
            System.out.print("Entre com o nome do aluno:" + (contadorAlunos+1) + ": ");
            vetNomeAluno[contadorAlunos] = scan.next();
            System.out.print("Informe a nota bimestral 1: ");
            matNotas[contadorAlunos][0] = scan.nextDouble();
            System.out.print("Informe a nota bimestral 2: ");
            matNotas[contadorAlunos][1] = scan.nextDouble();

            matNotas[contadorAlunos][2]=matNotas[contadorAlunos][0]*0.4 + matNotas[contadorAlunos][1]*0.6;

            acumulaMedia = acumulaMedia + matNotas[contadorAlunos][2];

            if (matNotas[contadorAlunos][2] >= 7.0){
                System.out.println(vetNomeAluno[contadorAlunos] + " - Você está aprovado.");
            } else if (matNotas[contadorAlunos][2] >= 5.0) {
                System.out.println(vetNomeAluno[contadorAlunos] + " - Você está em exame.");
            } else {
                System.out.println(vetNomeAluno[contadorAlunos] + " - Você está reprovado.");
            }
            System.out.println();
        }

        mediaTurma = acumulaMedia / contadorAlunos;

        System.out.printf("%s %.1f\n Média da turma", mediaTurma);

        System.out.println("\nPRocessando a média final de 10 alunos.\n");

        for (contadorAlunos = 0; contadorAlunos <10; contadorAlunos++){
            if (matNotas[contadorAlunos][2] > mediaTurma){
                System.out.printf("%s %s %.1f %s \n", vetNomeAluno, " - Média: ", matNotas[contadorAlunos][2], "- Bom aluno");
            } else if (matNotas[contadorAlunos][2] < mediaTurma){
                System.out.printf("%s %s %.1f %s \n", vetNomeAluno, " - Média: ", matNotas[contadorAlunos][2], "- Aluno com baixo desempenho");
            } else {
                System.out.printf("%s %s %.1f %s \n", vetNomeAluno, " - Média: ", matNotas[contadorAlunos][2], "- Aluno mediano");
            }
        }

    }
}

