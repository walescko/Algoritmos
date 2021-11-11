#include<stdio.h>
#include<stdlib.h>
int main(){
char vet[10];
int i;

for (i=0; i<10;i++){
    printf("\nentra:");
    scanf("%c",&vet[i]);
    fflush(stdin); //Usar essa função ou a função getchar()
}
for (i=0; i<10;i++){
    printf("\nvet=:%c", vet[i]);

}

}
