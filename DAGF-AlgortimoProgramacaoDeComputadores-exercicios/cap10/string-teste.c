#include<stdio.h>
#include <stdio_ext.h>

int main(){
    char vet[10];
    int i;

    scanf("%s",vet);
    __fpurge(stdin);

    printf("\nvet=: %s", vet);

}
