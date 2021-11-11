/*Desenvolva um algoritmo para armazenar em uma matriz o Nome, Endereço, Estado, Número do Telefone Celular e o e-mail de 10 pessoas.
Após o armazenamento desses dados, mostrar os dados dessas 10 pessoas, na forma uma matriz linhas x colunas */
#include <stdio.h>
#include <stdlib.h>
    
int main(void){
    
    int i; //variável de controle
    char dados[5];
    //char endereco[10][50];
    //char estado[10][3];
    //char telefone[10][9];
    //char email[10][50];
    

    
    printf("WADAJU SOFTWARE SOLUTIONS\n");
    printf("Agenda Básica - sem salvar em arquivo\n\n");
    printf("Entrada de cados\n");
    
    for (i = 0 ; i < 5 ; i++){
        if (i == 0) {
            dados[i] = 'n';
        } else if (i == 1){
            dados[i] = 4;
        } else if (i == 2){
            dados[i] = 00;
        } else if (i == 3){
            dados[i] = 3;
        } else if (i ==4){
            dados[i] = 100;
        }
    }
    
    printf("\nDados Digitados\n");
    for (i = 0; i < 5; i++){
        printf("%d\n",dados[i]);
    }
    printf("\n\nDepois de tempo consegui!\n\n");
    return 0;
    
}
    
    
    
