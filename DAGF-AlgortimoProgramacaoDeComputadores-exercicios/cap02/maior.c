#include <stdio.h>

int  main() {
    int x,y;
    
        printf("Digite dois números\n");
	scanf("%d", &x);
    	scanf("%d", &y);
    
    	if (x>y){
     		printf("o maior é %d \n", x);
     		} else {
     		printf("o maior é %d \n", y);
     	}	
    return (0);
}
