#include <stdio.h>

void main(){
    
    float n;
    int t;
    float r;
    
    printf("\nWADAJU SOFTWARE SOLUTIONS\n");
    printf("Expressão soma inversa\n");
    printf("Entre com um número inteiro ímpar: ");
    scanf("%d",&n);
    
    
    r = 0;
    for ( int i = 1 ; i <= n ; i++) {
        t = i % 2;
        if (t != 0){
            r = r + ((float)(i+1)/(n-(float)i));
        } else {
            r = r - ((float)(i+1)/(n-(float)i));
        }
        
    }
    
    printf("\nR = %.2f",r);
        
    printf("\nFim\n");
    
}
