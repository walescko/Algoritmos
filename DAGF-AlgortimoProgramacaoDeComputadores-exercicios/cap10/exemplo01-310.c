#include <stdio.h>
#include <stdlib.h>
//Calcula Média Final de 10 alunos
//Armazena dados em um vetor.

int main (){
    char vet_Nome_Aluno[10][30];
    float Mat_Notas[10][3];
    //Mat_Notas - Coluna 0 = Nota do Bimestre 1
    //                   1 = Nota do Bimestre 2
    //                   2 = Média Final calculada
    int contador_Alunos;
    float acum_Media = 0, mediaTurma;
    
    for (contador_Alunos = 0; contador_Alunos < 10 ; contador_Alunos++) {
        system("cls");
        printf("Informe o nome do aluno (a): %d : ", contador_Alunos+1);
        flush(stdin);gets(vet_Nome_Aluno[contador_Alunos]);
        printf("\nInforme a Nota Bimestral 1: ");
        scanf("%f", &Mat_Notas[contador_Alunos][0]);
        printf("\nInforme a Nota Bimestral 2: ");
        scanf("%f",&Mat_Notas[contador_Alunos][1]);
            
        Mat_Notas[contador_Alunos][2] = Mat_Notas[contador_Alunos][0]*0.4 + Mat_Notas[contador_Alunos][1]*0.6;
        
        acum_Media = acum_Media + Mat_Notas[contador_Alunos][2];
        
        if (Mat_Notas[contador_Alunos][2] >= 7.0) {
            printf("\n%s: ALUNO APROVADO!", vet_Nome_Aluno[contador_Alunos]);
        } else if (Mat_Notas[contador_Alunos][2] >=5.0){
            printf("%s: ALUNO EM EXAME!", vet_Nome_Aluno[contador_Alunos]);
        } else {
            ("\n%s: ALUNO REPROVADO!", vet_Nome_Aluno[contador_Alunos]);
        }
 //       _sleep(2000); //para execução por 2 segundos
        
    }
    
    mediaTurma = acum_Media / contador_Alunos;
        system("cls");
    printf("\n\nMedia da turma: %.1f", mediaTurma);
    
    return 0;
}
