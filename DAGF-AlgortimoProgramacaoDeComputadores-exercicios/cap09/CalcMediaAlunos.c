#include <stdio.h>
#include <stdlib.h>

void limpa(){
        char c;
        while ((c = getchar()) != '\n' && c !=EOF){}
}


int main (int argc, char* argv[]) {
    
    //Calculo de media final de 10 alunos
    char Vet_Nome_Aluno[10][30];
    float Vet_MediaFinal[10];
    int Contador_Alunos;
    float Acum_Media = 0, MediaTurma;
    
    for (Contador_Alunos = 0 ; Contador_Alunos < 10 ; Contador_Alunos++){
        //system("cls"); //cls - limpa a tela do monitor de video
        printf("Informe o nome do Aluno(a) - %d : ",Contador_Alunos +1);
        limpa();
        scanf("%[^\n]s",Vet_Nome_Aluno[Contador_Alunos]); //linha que tive que pesquisar para poder rodar o programa.
        printf("Informe a Média Final: ");
        scanf("%f", &Vet_MediaFinal[Contador_Alunos],30);
        if (Vet_MediaFinal[Contador_Alunos]>= 7.0){
            printf("%s, você está APROVADO(A).\n\n",Vet_Nome_Aluno[Contador_Alunos]);
        } else if (Vet_MediaFinal[Contador_Alunos] >= 5.0) {
            printf("%s, você está EM EXAME.\n\n", Vet_Nome_Aluno[Contador_Alunos]);
        } else {
            printf("%s, você está REPROVADO(A)!\n\n",Vet_Nome_Aluno[Contador_Alunos]);
        }
        Acum_Media = Acum_Media + Vet_MediaFinal[Contador_Alunos];
        //_sleep(1500); //comando _sleep() interrompe a execução por (x) milissegundos
    }
    
    MediaTurma = Acum_Media / Contador_Alunos;
    //system("cls");
    printf("Média da turma: %.2f ",MediaTurma);
    for (Contador_Alunos = 0 ; Contador_Alunos < 10 ; Contador_Alunos++) {
        if (Vet_MediaFinal[Contador_Alunos] > MediaTurma) {
            printf("\n%s - Média: %.2f - Bom Aluno(a).", Vet_Nome_Aluno[Contador_Alunos],Vet_MediaFinal[Contador_Alunos]);
        } else if (Vet_MediaFinal[Contador_Alunos] < MediaTurma) {
            printf("\n%s - Média: %.2f - Aluno(a) com baixo desempenho.",Vet_Nome_Aluno[Contador_Alunos],Vet_MediaFinal[Contador_Alunos]);
        } else {
            printf("\n%s - Média: %.2f - Aluno(a) Mediano(a).",Vet_Nome_Aluno[Contador_Alunos],Vet_MediaFinal[Contador_Alunos]);
        }
    }
    printf("\n <pressione enter para encerrar > ");
    //system("pause");
    //system("cls");
    return 0;
}
