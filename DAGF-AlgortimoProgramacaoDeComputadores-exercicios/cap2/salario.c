#include <stdio.h>

int main(){
	double salario;
	double novo;
	double ajuste, percent;

	printf("WADAJU SOFTWARE SOLUTIONS\n");
	printf("Salario novo\n");
	printf("Digite o valor do salário: ");
	scanf("%lf", &salario);
	printf("Qual o ajuste salarial em %: ");
	scanf("%lf", &ajuste);

	percent = ajuste / 100;
	novo = (1 + percent)*salario;

	printf("O novo salário será %.2lf\n",novo);
	printf("Fim do programa!\n");
	
	return 0;

}
	
