/*Defina duas matrizes de 5 linhas e 5 colunas cada uma, para armazenar
 * números inteiros, que serão solicitados e recebidos pelo teclado.
 * Gerar uma terceira matriz a partir da multiplicação dos elementos dessas 
 * duas matrizes. Após procedimentos de carga e geração da matriz soma, mostre o
 * conteúdo das três matrizes, na tela do computador.*/
#include <stdio.h>

int main (){
     // declaração de variáveis.
    int i,j; //variáveis de controle das matrizes
    
    printf("WADAJU SOFTWARE SOLUTIONS\n");
    printf("Soma de duas matrizes de ordem 5x5\n\n"); //podemos expandir esse programa para que possa fazer as operações com matrizes de quaisquer tamanho.
    
    printf("Digite os elementos da primeira matriz:\n");
    int A[5][5];
    for (i = 0; i < 5; i++){
        for (j = 0 ; j < 5 ; j++){
            printf("A %d%d: ", i+1,j+1);
            scanf("%d", &A[i][j]);
        }
    }
    
    printf("Digite os elementos da segunda matriz:\n");
    int B[5][5];
    for (i = 0; i < 5; i++){
        for (j = 0 ; j < 5 ; j++){
            printf("B %d%d: ", i+1,j+1);
            scanf("%d", &B[i][j]);
        }
    }
    //A + B - soma das matrizes A e B
    int C[i][j];
    for (i = 0 ; i < 5; i++) {
        for ( j = 0 ; j < 5 ; j++){
            C[i][j] = A[i][j] + B[i][j];
        }
    }
 
    //imprimindo na tela a matriz A
    printf("A matriz A é:\n");
    for ( i = 0; i < 5; i++){
        printf("\n");
        for ( j = 0 ; j < 5 ; j++){
            printf("%d ",A[i][j]);
        }
    }
    
    //imprimindo na tela a matriz B
    printf("\nA matriz B é:\n");
    for ( i = 0; i < 5; i++){
        printf("\n");
        for ( j = 0 ; j < 5 ; j++){
            printf("%d ",B[i][j]);
        }
    }
 
    //imprimindo na tela a matriz B
    printf("\nA matriz C, a matriz soma, é:\n");
    for ( i = 0; i < 5; i++){
        printf("\n");
        for ( j = 0 ; j < 5 ; j++){
            printf("%d ",C[i][j]);
        }
    }
 
 
    printf("\n");
    return 0;
}
