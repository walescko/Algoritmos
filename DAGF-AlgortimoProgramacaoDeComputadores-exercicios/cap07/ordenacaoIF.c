#include <stdio.h>

 void limpar_entrada(){
	char c;
	while((c=getchar()) != '\n' && c != EOF){}
 }
 
 void main(){
     int a,b,c; //variaveis de entrada.
     int maior, menor; //variaveis de comparação
     
     printf("\nWADAJU SOFTWARE SOLUTIONS\n");
     printf("Maior e menor\n");
     printf("Digite três valores inteiros:\n");
     printf("A = ");
     scanf("%d",&a);
     printf("B = ");
     scanf("%d",&b);
     printf("C = ");
     scanf("%d",&c);
     
     //comparação maior
     
     if ((a > b) && (a>c)) {
         maior = a;
     } else if ((b > c)){
         maior = b;
     } else {
         maior = c;
     }
     //comparação menor
     if ((a < b) && (a < c)) {
         menor = a;
     } else if ((b < c)){
         menor = b;
     } else {
         menor = c;
     }
     
     printf("Números digitados:\n");
     printf("A = %d, B = %d e C = %d\n",a,b,c);
     printf("Classificação\n");
     printf("Maior = %d\n",maior);
     printf("Menor = %d\n",menor);
     printf("\nFim\n");
     
     //return 0;
     
    }
     
