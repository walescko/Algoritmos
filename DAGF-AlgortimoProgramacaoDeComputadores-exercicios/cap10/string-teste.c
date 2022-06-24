#include<stdio.h>
#include <stdio_ext.h>

int main(void){
    char vet[10];

    scanf("%s",vet);
    __fpurge(stdin);

    printf("\nvet=: %s", vet);

    return 0;
}
