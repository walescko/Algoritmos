#include <stdio.h>

int main(){
    
    int j,k; //variável de controle para o vetor par
    int inicio, final; //variáveis de controle do inicio e final do intervalo
    int intervalo, numero1, numero2; //intervaldo do inicio ao fim e variável de teste;
    int sumImpar, sumPar; //soma dos números pares do intervalo
    int teste; //variável de teste par/ímpar
    
    printf("WADAJU SOFTWARE SOLUTIONS\n");
    printf("Montando vetores somente com números ímpares ou pares.\n");
    printf("Soma dos ímpares e dos pares de um intervalo.\n");
    
    printf("Digite o primeiro número do intervalo: ");
    scanf("%d", &inicio);
    printf("Digite o número final do intervalo: ");
    scanf("%d", &final);
    
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
    printf("Os números ímpares são:\n");
    for (int i = 0; i <= j-1; i++){
        printf("%d ", impar[i]);
    }
    printf("A soma dos números ímpares do intervalo é %d.\n\n", sumImpar);
    
    //apresentação do vetor par 
    printf("Os números pares são:\n");
    for (int i = 0; i <= k-1; i++){
        printf("%d ", par[i]);
    }
    printf("A soma dos números pares do intervalo é %d.\n", sumPar);
    
    
return 0;    
}
