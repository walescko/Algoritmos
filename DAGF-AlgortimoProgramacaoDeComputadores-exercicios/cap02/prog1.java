import java.util.*;
public class prog1{
	public prog1(){
}

public static void main(String[] args){
	int x,y;
	System.out.println("Digite dois números: ");
	Scanner entrada;
	entrada = new Scanner(System.in);
	x = entrada.nextInt();
	entrada = new Scanner(System.in);
	y = entrada.nextInt();
	
	System.out.print("O maior deles é: ");
	if (x >y){
		System.out.println(x);
	} else {
		System.out.println(y);
	}
	}
}
