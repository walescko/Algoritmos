#include <stdio.h>
#include <math.h>

int main(){

	float graus, rad, xsen, xcos, xtan;
	
	printf("WADAJU SOFTWARE SOLUTIONS\n");
	printf("Seno, Cosseno e tangente de um ângulo\n");
	printf("Qual é o ângulo, em graus? ");
	scanf("%f",&graus);
	
	rad = (M_PI * graus) / 180;

	xsen = sin(rad);
	xcos = cos(rad);
	xtan = tan(rad);

	printf("Ângulo: %.2f\n",graus);
	printf("sen(%.2f) = %.4f\n",graus,xsen);
	printf("cos(%.2f) = %.4f\n",graus,xcos);
	printf("tan(%.2f) = %.4f\n",graus,xtan);
	printf("\nTerminou\n");

	return 0;

}
