package com.company.walescko.cap09;

import java.util.Scanner;

public class MediaFinal {

    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        String[] studentsName;
        float[] finalAverage;
        float accumulateAverage = 0, classAverage;
        int studentsQtd = 1;
        int n = 3; //quantidade de loops

        studentsName = new String[n];
        finalAverage = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Informe o nome do aluno do %s : ", i + 1);
            studentsName[i] = scan.next();
            System.out.print("Informe a média final: ");
            finalAverage[i] = scan.nextFloat();

            if (finalAverage[i] >= 7.0) {
                System.out.printf("Você está APROVADO %s\n", studentsName[i]);
            } else if (finalAverage[i] >= 5.0) {
                System.out.printf("Você está em Exame %s\n", studentsName[i]);
            } else {
                System.out.printf("Você está reprovado %s\n", studentsName[i]);
            }

            accumulateAverage = accumulateAverage + finalAverage[i];
            studentsQtd += 1;
        }

        classAverage = accumulateAverage/studentsQtd;
        System.out.printf("Média da turma: %s\n", classAverage);

        for (int i = 0; i < n; i++){
            if (finalAverage[i] >= classAverage){
                System.out.printf("%s - Média: %s - Bom Aluno\n", studentsName[i], finalAverage[i]);
            } else {
                System.out.printf("%s - Média: %s - Aluno com baixo desempenho\n", studentsName[i], finalAverage[i]);

            }
        }
    }
}