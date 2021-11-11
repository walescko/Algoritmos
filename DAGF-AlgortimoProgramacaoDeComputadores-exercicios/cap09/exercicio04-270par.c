#include <stdio.h>

int main(){
    
    int j; //variável de controle para o vetor par
    int inicio, final; //variáveis de controle do inicio e final do intervalo
    int intervalo, numero; //intervaldo do inicio ao fim e variável de teste;
    int sumPar; //soma dos números pares do intervalo
    int teste; //variável de teste par/ímpar
    
    printf("WADAJU SOFTWARE SOLUTIONS\n");
    printf("Montando um vetor somente com números pares.\n");
    printf("Soma do pares do intervalo.\n");
    
    printf("Digite o primeiro número do intervalo: ");
    scanf("%d", &inicio);
    printf("Digite o número final do intervalo: ");
    scanf("%d", &final);
    
    intervalo = final - inicio;
    numero = inicio;
    
    printf("O intervalo escolhido tem %d elementos.\n", intervalo+1);
    //montanto o vetor par
    sumPar = 0;
    int par[intervalo];
    j = 0;
    for (int i = 0 ; i <= intervalo; i++){
        teste = numero % 2;
        if (teste == 0) {
            par[j] = numero;
            sumPar = sumPar + numero;
            j = j + 1;
        }
        numero = numero + 1;
    }
    
    //apresentação do vetor par 
    for (int i = 0; i <= j-1; i++){
        printf("%d ", par[i]);
    }
    printf("A soma dos números pares do intervalo é %d.\n", sumPar);
    
return 0;    
}
