#include <stdio.h>

int main(){

	float a,b,c; //coeficientes da primeira equação
	float d1,e,f1; //coeficientes da segunda equação
	float x,y; //incognitas das equações
	
	printf("WADAJU SOFTWARE SOLUTIONS\n");
	printf("Sistema linear de duas equações\n");
	printf("Digite os coefientes A,B e C da primeira equação Ax + By = C\n");
	printf("A = ");
	scanf("%f",&a);
	printf("B = ");
	scanf("%f",&b);
	printf("C = ");
	scanf("%f",&c);
	printf("Digite os coefientes D,E e F da segunda equação Dx + By= F\n");
	printf("D = ");
	scanf("%f",&d1);
	printf("E = ");
	scanf("%f",&e);
	printf("F = ");
	scanf("%f",&f1);

	//Teste de validade de resolução
	
	if ((a*e - b*d1) == 0 ) {
		printf("O sistema não em solução!\n");
		} else {
			x = (c*e-b*f1)/(a*e-b*d1);
			y = (a*f1-c*d1)/(a*e-b*d1);
			
		
			printf("O sistema\n");
			printf("%.2f x + %.2f y = %f \n",a,b,c);
			printf("%.2f x + %.2f y = %f \n",d1,e,f1);
			printf("Tem como solução: x = %.2f e y = %.2f\n", x,y);
			printf("Fim do Programa\n");
			
		}		
	return 0;
	}
