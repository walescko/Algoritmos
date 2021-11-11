#include <stdio.h>

int main(){

	int a,b,c;
	
	printf("WADAJU SOFTWARE SOLUTIONS\n");
	printf("Troca de posições de numeros inteiros\n");
	printf("Entre com valor de A:\a ");
	scanf("%d", &a);
	printf("Entre com o valor de B:\a ");
	scanf("%d", &b);
	
	c = a;
	a = b;
	b = c;

	printf("\nO valor de A é %d e o valor de B é %d após a troca\n",a,b);
	printf("Fim do programa!\n");

	return 0;

}
