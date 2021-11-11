/*Desenvolva um algoritmo para armazenar em uma matriz o Nome, Endereço, Estado, Número do Telefone Celular e o e-mail de 10 pessoas.
Após o armazenamento desses dados, mostrar os dados dessas 10 pessoas, na forma uma matriz linhas x colunas */
#include <stdio.h>
#include <stdlib.h>
    
int main(void){
    
    int i; //variável de controle
    char nome[10][50];
    char endereco[10][50];
    char estado[10][3];
    char telefone[10][9];
    char email[10][50];
    

    
    printf("WADAJU SOFTWARE SOLUTIONS\n");
    printf("Agenda Básica - sem salvar em arquivo\n\n");
    printf("Entrada de cados\n");
    
    for (i = 0 ; i < 10 ; i++){
        printf("Registre o %dº contato.\n",(i+1));
        printf("Nome: ");
        scanf("%s",&nome[i]);
        printf("Endereço: ");
        scanf("%s",&endereco[i]);
        printf("Estado: ");
        scanf("%s",&estado[i]);
        printf("Telefone: ");
        scanf("%s",&telefone[i]);
        printf("E-mail: ");
        scanf("%s", &email[i]);
    }
    printf("\nDados Digitados\n");
    for (i = 0; i < 10; i++){
        printf("Registro %dº:\n",i+1);
        printf("Nome %s\n",nome[i]);
        printf("Endereço %s\n",endereco[i]);
        printf("Estado %s\n",estado[i]);
        printf("Telefone %s\n",telefone[i]);
        printf("E-mail %s\n\n", email[i]);
    }
    printf("Depois de tempo consegui!\n\n");
    return 0;
    
}
    
    
    
