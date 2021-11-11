import java.io.*;
import java.util.Scanner;

   public class soma{
    public soma(){
     }
     public static void main(String[] args){
      int x,y,s;
      Scanner dado;
      dado = new Scanner(System.in);

	
      System.out.println("Entre com dois valores");
	x = dado.nextInt();
     // dado = new Scanner(System.in);
	y = dado.nextInt();
	
      s = x + y;

	System.out.println("A soma é "+ s);
	System.out.println("Fim do programa");

     }
}
