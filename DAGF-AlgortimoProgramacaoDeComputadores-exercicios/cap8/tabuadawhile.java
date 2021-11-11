import java.io.*;
import java.util.*;

class tabuadawhile{
    public static void main(String args[]){
    
        int n, p, r, i, soma;
        Scanner s = new Scanner(System.in);
        
        System.out.println("WADAJU SOFTWARE SOLUTIONS");
        System.out.println("Tabuada");
        System.out.println("Entre com um valor inteiro: ");
        n = s.nextInt();
        
        soma = 0;
        i = 1;
        do {
            r = n * i;
            soma = soma + 1;
            i = i + 1;
            System.out.println(n + " x " + i + " = " + r );
            } 
            while (i <=10 );
            
        System.out.println();
        System.out.println("Fim");
        
    }
}
