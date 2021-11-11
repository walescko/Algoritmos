#include <stdio.h>

int main() {
	int I;
	float F;
	char C;
	printf("Entre um caractere: ");
	scanf("%c",&C);
	printf("Digite um número Inteiro: ");
	scanf("%d",&I);
	printf("Digite um número Real: ");
	scanf("%f",&F);

//imprimindo os valores lidos

	printf("\n\nValores lidos\n\n C = %c \n I = %d\n F = %.2f\n\n",C,I,F);

return 0;
}

