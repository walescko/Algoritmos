#include <stdio.h>

int main(){
	
	float celsius,fahrenheit;

	printf("WADAJU SOFTWARE SOLUTIONS\n");
	printf("Convertendo de Celsius para Fahrenheit\n");
	printf("Entre com o valor de temperatura em Celsius: ");
	scanf("%f",&celsius);
	
	fahrenheit = (celsius/5)*9 + 32 ;

	printf("Valor em Celsius: %.2f ºC\n",celsius);
	printf("Valor em Fahrenheit: %.2f ºF\n",fahrenheit);
	printf("Fim do Algoritmo\n");

	return 0;

}
