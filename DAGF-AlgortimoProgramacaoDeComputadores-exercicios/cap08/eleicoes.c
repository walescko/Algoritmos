#include <stdio.h>

void main(){
    int eleitores; //total de eleitores
    int veleitores; //eleitores que votaram
    float peleitores; //percentual que votaram
    int acesso, encerra, code; //abertura e encerramento da urna
    int cadA, cadB, nulo, branco,voto; //votos
    
    printf("\nWADAJU SOFTWARE SOLUTIONS\n");
    printf("Eleições Jaguaraland\n");
    printf("Quantos eleitores tem na sessão? ");
    scanf("%d",&eleitores);
    
    do {
        printf("\n\nPara iniciar a sessão entre com o código de acesso: ");
        scanf("%d",&acesso);}
    while (acesso !=12345);
    
    printf("\nAcesso Liberado ao programa de votação\n");
    printf("\nRegistro de votos\n");
    //Registro de votos
    veleitores = 0;
    cadA = 0;
    cadB = 0;
    nulo = 0;
    branco = 0;
    code = 54321;
    do {
        printf("Lista de Canditados dessa eleições:\n");
        printf("Anne Shirley - número 11\n");
        printf("Gilbert Blate - núemro 12\n");
        printf("Digite o número do seu canditado: ");
        scanf("%d",&voto);
        
//         nessa parte do código ficará mais legível se usar o comando switch case
        if (voto == 11) {
            cadA = cadA + 1;
        } else if (voto == 12) {
            cadB = cadB +1;
        } else if (voto == 0 ) {
            branco = branco +1;
        } else{
            nulo = nulo + 1;
        }
        
        veleitores = veleitores + 1;

        if (veleitores == eleitores-1){
            printf("\nFalta somente 1 eleitor para votar\n");
            printf("O programa se encerra automáticamente após \no último eleitor votar\n");
        } else {
            printf("\nDigite o código de encerramenot ou 777 para continuar ");
            scanf("%d", &encerra);
        }

        } while (encerra != code );
        
        peleitores = ((float)veleitores / (float)eleitores) * 100;
        
        printf("\n\nResultado das eleições:");
        printf("\nTotal de eleitores: %d.", eleitores);
        printf("\nEleitores que votaram: %d",veleitores);
        printf("\nPercentual que votaram: %.2f \%",peleitores);
        printf("\nVotos Anne Shirley - 11: %d eleitores", cadA);
        printf("\nVotos Gilbert Blate - 12: %d eleitores",cadB);
        printf("\nVotos Nulos: %d eleitores",nulo);
        printf("\nVotos Brancos: %d eleitores",branco);
        printf("\n\nFim\n");
        
}
