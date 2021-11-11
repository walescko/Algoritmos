#include <stdio.h>

void main(){
    
    float nota;
    char op;
    
    printf("\nWADAJU SOFTWARE SOLUTIONS\n");
    printf("Notas e Conceitos\n");
    printf("Entre com a nota do aluno: ");
    scanf("%f",&nota);
    
    if ((nota>=9)&&(nota<=10)){
        printf("\nA");
    } else if ((nota>=7)&&(nota<9)){
        printf("\nB");
    } else if ((nota>=5)&&(nota<7)){
        printf("\nC");
    } else if ((nota>=2,5)&&(nota<5)){
        printf("\nD");
    } else if ((nota>=0)&&(nota<2,5)){
        printf("\nE");
    } else {
        printf("\nNota inválida");
    }
    
    printf("\nFim");
    
}
