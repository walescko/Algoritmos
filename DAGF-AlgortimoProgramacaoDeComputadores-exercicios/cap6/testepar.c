#include <stdio.h>

int main(){
	int numero,resto;

	printf("WADAJU SOFTWARE SOLUTIONS\n");
	printf("Teste par\n");
	printf("Digite um número: ");
	scanf("%d",&numero);

	resto = numero % 2;

	if (resto == 0) {
		printf("O número %d é par", numero);
		} else{
		printf("O número %d é ímpar", numero);
		}
	printf("\n\nO programa tem porta\n");
	return 0;

}
