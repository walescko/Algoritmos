#include <stdio.h>

int main(){
    
    int a, b,c;
    
    printf("WADAJU SOFTWARE SOLUTIONS");
    printf("\nClassificação de Triangulos\n");
    printf("Entre com três valores dos lados de um triângulo:\n");
    printf("Entre com o lado A do triângulo: ");
    scanf("%d",&a);
    printf("\nEntre com o lado B do triângulo: ");
    scanf("%d", &b);
    printf("\nEntre com o lado C do triângulo: ");
    scanf("%d",&c);
    
    if ((a < b+c) && (b < a + c) && (c < b + a )){ 
        printf("\nAs medidas %d, %d e %d formam um triângulo.\n", a,b,c);
    
    
        if ((a == b) && (b == c)){
            printf("O triângulo é EQUILÁTERO.");
        } if ((a == b) || (a == c) || (b == c)) {
            printf("\nO triângulo é ISÓCELES.");
        } else {
            printf("\nO triângulo é ESCALENO.");
        }
    } else {
        printf("As medidas %d, %d e %d não formam um triângulo.\n", a,b,c);
    }
    
    printf("\n\nFim\n");
    return 0;
    
}
