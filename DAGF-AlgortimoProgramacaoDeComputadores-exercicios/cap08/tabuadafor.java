import java.io.*;
import java.util.*;

class tabuadafor{
    public static void main(String args[]){
    
        int n, p, r;
        Scanner s = new Scanner(System.in);
        
        System.out.println("WADAJU SOFTWARE SOLUTIONS");
        System.out.println("Tabuada");
        System.out.println("Entre com um valor inteiro: ");
        n = s.nextInt();
        
        for (int i = 1 ; i <= 10 ; i++){
            r = n * i;
            System.out.println(n + " x " + i + " = " + r );
            }
            
        System.out.println();
        System.out.println("Fim");
        
    }
}
