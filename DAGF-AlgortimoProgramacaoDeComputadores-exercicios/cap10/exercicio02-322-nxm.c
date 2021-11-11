/*Defina duas matrizes de 5 linhas e 5 colunas cada uma, para armazenar
 * números inteiros, que serão solicitados e recebidos pelo teclado.
 * Gerar uma terceira matriz a partir da multiplicação dos elementos dessas 
 * duas matrizes. Após procedimentos de carga e geração da matriz soma, mostre o
 * conteúdo das três matrizes, na tela do computador.*/
/*Exercício proposto no Livro Algoritmos e Programação de Computadores
 * D. Piva Jr, A. M Engelbrecht, G. S. Nakamiti e F. Bianchi
 * 2ª Edição, Editora ELSEVIER, 528p,2019 */
#include <stdio.h>

int main (){
     // declaração de variáveis.
    int i,j,n,m; //variáveis de controle das matrizes
    
    printf("WADAJU SOFTWARE SOLUTIONS\n");
    printf("Soma de duas matrizes de ordem nxm\n\n");
    printf("Quantas linhas terá cada matriz? ");
    scanf("%d",&n);
    printf("Quantas colunas terá cada matriz? ");
    scanf("%d", &m);
    printf("\nCada uma das matrizes será da ordem de %d x %d.", n,m);
    
    printf("Digite os elementos da primeira matriz:\n");
    int A[n][m];
    for (i = 0; i < n; i++){
        for (j = 0 ; j < m ; j++){
            printf("A %d%d: ", i+1,j+1);
            scanf("%d", &A[i][j]);
        }
    }
    printf("Digite os elementos da segunda matriz:\n");
    int B[n][m];
    for (i = 0; i < n; i++){
        for (j = 0 ; j < m ; j++){
            printf("B %d%d: ", i+1,j+1);
            scanf("%d", &B[i][j]);
        }
    }
    //A + B - soma das matrizes A e B
    int C[n][m];
    for (i = 0 ; i < n; i++) {
        for ( j = 0 ; j < m ; j++){
            C[i][j] = A[i][j] + B[i][j];
        }
    }
 
    //imprimindo na tela a matriz A
    printf("A matriz A é:\n");
    for ( i = 0; i < n; i++){
        printf("\n");
        for ( j = 0 ; j < m ; j++){
            printf("%d ",A[i][j]);
        }
    }
    //imprimindo na tela a matriz B
    printf("\nA matriz B é:\n");
    for ( i = 0; i < n; i++){
        printf("\n");
        for ( j = 0 ; j < m ; j++){
            printf("%d ",B[i][j]);
        }
    }
    //imprimindo na tela a matriz C - matriz soma de A e B
    printf("\nA matriz C, a matriz soma, é:\n");
    for ( i = 0; i < n; i++){
        printf("\n");
        for ( j = 0 ; j < m ; j++){
            printf("%d ",C[i][j]);
        }
    }
    printf("\n");
    return 0;
}
