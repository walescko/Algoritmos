#include <stdio.h>

int main(){

	float valor, desconto, descdec, valordesc;

	printf("WADAJU SOFTWARE SOLUTIONS\n");
	printf("Calculo de desconto\n");
	printf("Qual o valor da mercadoria? ");
	scanf("%f",&valor);
	printf("Qual o valor do desconto em %?");
	scanf("%f",&desconto);

	descdec = desconto/100;
	valordesc = valor * (1 - descdec);

	printf("Preço sem desconto R$ %.2f\n",valor);
	printf("Desconto dado %.2f %%\n",desconto);
	printf("Valor com desconto é R$ %.2f\n",valordesc);
	printf("Acabou tchê!\n");
	
	return 0;

}

