/*Elabore um algoritmo que receba, inicialmente, o valor de uma aplicação e de uma taxa de juros. ok
 *Considerando que essa taxa de juros aumente 0,025% ao mês, então armazene em vetores, com 12 elementos cada,
 * o valor das taxas de juros, o valor dos juros e o valor da aplicação corrigida, Após, mostre o valor inicial da
 * aplicação e o conteúdo dos vetores. */
#include <stdio.h>
#include <string.h>

int main () {
    
    double taxa;
    double aplicado;
    int n, i, j; //variaveis de controle 
    double montante[12];
    double rendimento[12];
    
    printf("\nWADAJU SOFTWARE SOLUTIONS\n");
    printf("Aplicações financeira e ganho de capital\n");
    printf("Qual o valor aplicacado? R$ ");
    scanf("%lf",&aplicado);
    printf("Qual a taxa de juros mensal? ");
    scanf("%lf",&taxa);
    
    for (int i = 0, i <= 12, i++){
    montante[i] = aplicado * (1 +(taxa/100));
    rendimento[i] = montante[i] - aplicado;
    
    }
    
    printf("\nO valor aplicado de R$ %.2lf rendeu R$ %.2lf totalizando R$ %.2lf quando a taxa for de %.2lf %.", aplicado, rendimento, montante, taxa);
    printf("\n\n");

    return 0;    
}

    
