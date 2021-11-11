#include <stdio.h>

int main(){
    int a,b,troca,multiplo;
    
    printf("\nWADAJU SOFTWARE SOLUTIONS\n");
    printf("Multiplos\n\n");
    printf("Entre com dois valores inteiros:\n");
    printf("A = ");
    scanf("%d", &a);
    printf("B = ");
    scanf("%d", &b);
    
    if (a<b){
        troca = b;
        b = a;
        a = troca;}
        
    multiplo = a %b;
    
    if (multiplo==0){
        printf("O número %d é multiplo de %d.\n",a,b);
    }else{  
        printf("Os números %d e %d não são múltiplos.\n", a,b);
    }
    
    printf("\nFim\n");
    return 0;
}
    
