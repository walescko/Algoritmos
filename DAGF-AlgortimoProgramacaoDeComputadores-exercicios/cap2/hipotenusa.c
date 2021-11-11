#include <stdio.h>
#include <math.h>

int main(){

	double hip, catA, catB;
	
	printf("WADAJU SOFTWARE SOLUTIONS\n");
	printf("Hipotenusa - Teorema de Pitágoras\n");
	printf("Entre com o valor do Cateto A: ");
	scanf("%lf",&catA);
	printf("Entre com o valor do Cateto B: ");
	scanf("%lf",&catB);

	hip = sqrt(pow(catA,2)+pow(catB,2));

	printf("O valor da hipotenusa é %.2lf",hip);
	printf("\nFim do Programa\n");
	
	return 0;

}
