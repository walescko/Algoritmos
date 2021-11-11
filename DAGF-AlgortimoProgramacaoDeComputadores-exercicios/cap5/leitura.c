#include <stdio.h>

int main(){
	int a,b;
	double x,y;
	
	printf("WADAJU SOFTWARE SOLUTIONS\n");
	printf("Estrutura Sequencial\n");
	printf("Entre com um valor inteiro A: ");
	scanf("%d%",&a);
	printf("Entre com um valor inteiro B: ");
	scanf("%d",&b);

	x = (double)a + (double)b / 100;
	y = ((double)a + (double)b ) / 100;

	printf("\nA = %d, B = %d, X = %.2f, Y = %.2f\n", a,b,x,y);
	printf("\nFim do algoritmo\n");
	
	return 0;

}

