#include <stdio.h>

void main() {
    
        int n;//total de soldados
        int f; //fileira
        int fileira, falta;
        
        printf("\nWADAJU SOFTWARE SOLUTIONS\n");
        printf("Pelotão Triângular\n");
        printf("Qual o número de soldados para o pelotão? ");
        scanf("%d",&soldados);
        
        fileira = 1;
        falta = 0;
        soldadof = 1;
        
            for ( total = 1 ; total <= soldados ; (total = soldadof + fileira)) ;
            soldadof = fileira;
            if  (total < soldados ) {
                printf("\nNa %d fileira temos %d solado(s)",fileira,soldadof);
                fileira = fileira + 1;
            } else {
                falta = soldados - total;
                printf("\nFaltam %d soldados para %d fileira", (fileira + 1), falta);
            }
        printf("\nDuvidei agora de rodar certo\n");
        
}
        
