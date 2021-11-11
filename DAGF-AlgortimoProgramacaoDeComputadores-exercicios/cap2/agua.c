#include <stdio.h>

int main(){
	
	double salariomin; //valor do salario minimo
	double volume; //consumo de agua
	double preco; //preco do volume unitario metro cubico
	double custo; //preco a pagar sem desconto
	double desconto; //valor do desconto
	double prefinal; //valor a pagar com desconto
	
	printf("WADAJU SOFTWARE SOLUTIONS\n");
	printf("Consumo de água\n");
	printf("Qual o valor do salário minimo? ");
	scanf("%lf",&salariomin);
	printf("Qual o consumo de água mensal em m³? ");
	scanf("%lf",&volume);
	printf("Qual o valor do desconto em %? ");
	scanf("%lf",&desconto);

	preco = 0.02 * salariomin;
	custo = preco * volume;
	prefinal = custo * (1-desconto/100);

	printf("O valor a ser pago sem desconto é %.2lf\n" , custo);
	printf("O valor com desconto de %2.lf % é de %.2lf\n",desconto,prefinal);
	
	return 0;

}	
