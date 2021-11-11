#include <stdio.h>
#include <time.h>

void main(/*int argc, char &argv[]*/){
    int casamento, atual;
    //struct tm *atual;
    int anos;
    char op;
    
    printf("\nWADAJU SOFTWARE SOLUTIONS\n");
    printf("Anos de Casamento\n");
    printf("Qual o ano de casamento? ");
    scanf("%d",&casamento);
    printf("O ano atual é? ");
    scanf("%d",&atual);
    
    anos = atual - casamento;
    //op = anos;
    if (anos == 75) {
        op = 'a';
    } else if (anos == 50){
        op = 'b';
    } else if (anos == 25) {
        op = 'c';
    }
    
    
    
    switch (op) {
        case 'a'  : printf("75 anos de casados, Bodas de Diamante."); break;
        case 'b' : printf("50 anos de casados, Bodas de Ouro."); break;
        case 'c' : printf("25 anos de casados, Bodas de Prata."); break;
        default : printf("São casados há %d anos",anos);
    }
    
    printf("\n\nFim\n");
    
}
