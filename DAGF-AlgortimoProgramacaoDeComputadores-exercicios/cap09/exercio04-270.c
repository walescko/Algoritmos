/*Elabore um algoritmo para armazenar em vetores distintos, os números pares e ímpares contidos entre 348 e 863, inclusive.
Após, mostre o conteúdo desses vetores e a soma dos números pares e ímpares contido neles. */
#include <stdio.h>

int main(){
    
    int j,k; //variável de controle para o vetor par
    int inicio, final; //variáveis de controle do inicio e final do intervalo
    int intervalo, numero1, numero2; //intervaldo do inicio ao fim e variável de teste;
    int sumImpar, sumPar; //soma dos números pares do intervalo
    int teste; //variável de teste par/ímpar
    
    printf("WADAJU SOFTWARE SOLUTIONS\n");
    printf("Intervalo de 348 a 863\n");
    printf("Soma dos ímpares e pares do intervalo.\n");
    
    inicio = 348;
    final = 863;
    
    intervalo = final - inicio;
    numero1 = inicio;
    numero2 = inicio;
    
    printf("\nO intervalo escolhido tem %d elementos.\n\n", intervalo+1);
    //montanto o vetor impar
    sumImpar = 0;
    int impar[intervalo];
    j = 0;
    for (int i = 0 ; i <= intervalo; i++){
        teste = numero1 % 2;
        if (teste != 0) {
            impar[j] = numero1;
            sumImpar = sumImpar + numero1;
            j = j + 1;
        }
        numero1 = numero1 + 1;
    }
    
    //montanto o vetor par
    sumPar = 0;
    int par[intervalo];
    k = 0;
    for (int i = 0 ; i <= intervalo; i++){
        teste = numero2 % 2;
        if (teste == 0) {
            par[k] = numero2;
            sumPar = sumPar + numero2;
            k = k + 1;
        }
        numero2 = numero2 + 1;
    }
    
    //apresentação do vetor impar 
    printf("Números ímpares do intervalo 348 a 863.\n");
    for (int i = 0; i <= j-1; i++){
        printf("%d ", impar[i]);
    }
    printf("\nA soma dos números ímpares do intervalo é %d.\n\n", sumImpar);
    
    //apresentação do vetor par 
    printf("Números pares do intervalo 348 a 863.\n");
    for (int i = 0; i <= k-1; i++){
        printf("%d ", par[i]);
    }
    printf("\nA soma dos números pares do intervalo é %d.\n", sumPar);
    
    
return 0;    
}
