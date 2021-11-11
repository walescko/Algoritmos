#include <stdio.h>

int main(){

	int a,b,maior,menor;

	printf("WADAJU SOFTWARE SOLUTIONS\n");
	printf("Programa Maior\n");
	printf("Digite dois números inteiros\n");
	scanf("%d",&a);
	scanf("%d",&b);

	if (a > b){
		maior = a;
		menor = b;
	} else {
		maior = b;
		menor = a; 
	}
	
	printf("Números digitados A = %d e B = %d\n", a,b);
	printf("Maior = %d\n", maior);
	printf("Menor = %d\n", menor);
	printf("\nA casa tem porta!\n");

	return 0;

}
