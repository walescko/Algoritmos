#include <stdio.h>
 
 void limpar_entrada(){
	char c;
	while((c=getchar()) != '\n' && c != EOF){}
 }
 
 void main() {
     float a,b;
     char op;
     
     printf("Digite dois números e a operação (+,-,*,/): ");
     printf("\nA = ");
     scanf("%f",&a);
     printf("\nB = ");
     scanf("%f",&b);
     printf("Qual a operação a ser realizada? ");
     limpar_entrada();
     scanf("%c",&op);
     
     switch (op){
         case '+' : printf("%.1f %c %.1f = %.1f\n", a,op,b,a+b); break;
         case '-' : printf("%.1f %c %.1f = %.1f\n", a,op,b,a-b); break;
         case '*' : printf("%.1f %c %.1f = %.1f\n", a,op,b,a*b); break;
         case '/' : if ( b == 0) {
                    printf("A operação não pode ser realizada");
                    }
                    else {
                        printf("%.1f %c %.1f = %.2f\n", a,op,b,a/b);
                    }
                    break;
         default : printf("Operação Inválida");
     } 
     
     printf("\n\n");
     
 }
                 
