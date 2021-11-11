#include <stdio.h>
#include <math.h>

void main(){
    int i,j;
    int a,b;
    int soma = 0;
    
    printf("\nWADAJU SOFTWARE SOLUTIONS");
    printf("\nSomatório\n");
    printf("Entre com dois valores:\n");
    printf("A = ");
    scanf("%d",&a);
    printf("B = ");
    scanf("%d",&b);
    
    for ( i = 1 ; i <=a ; i++ ){
        for ( j = 1 ; j <= b ; j++ ) {
            soma = soma + ((a*b)+pow((i+j),2));
          //  printf("%d ",soma);
            
        }
    }
    
    printf("\nResultado = %d.",soma);
    printf("\nFim\n");
    
    
}
