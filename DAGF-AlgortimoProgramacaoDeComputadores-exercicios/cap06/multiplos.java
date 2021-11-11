import java.io.*;
import java.util.Scanner;

class multiplos{
    public static void main(String args[]){
        int a,b,troca,resto;
        Scanner s = new Scanner(System.in);
        
        System.out.println("WADAJU SOFTWARE SOLUTIONS");
        System.out.println("Multiplos");
        System.out.println();
        System.out.println("Entre com dois valores inteiros:");
        System.out.print("A = ");
        a = s.nextInt();
        System.out.print("B = ");
        b = s.nextInt();
        
        if (a < b ) {
            troca = b;
            b = a ;
            a = troca;
            }
        
        resto = a % b ;
        
        if ( resto == 0 ) {
            System.out.println("O número "+a+" é multiplo do número "+b+".");
        } else{
            System.out.println("O número "+a+" não é multiplo de " +b+".");
            }
            
            System.out.println();
    //        return 0;
    }
}
