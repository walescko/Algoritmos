import java.util.*;

public class maior{
	public static void main(String[] args){

	int a,b,maior,menor;

	Scanner entrada = new Scanner(System.in);

	System.out.println("WADAJU SOFTWARE SOLUTIONS");
	System.out.println("Maior e menor");
	System.out.println("Digite dois números inteiros:");
	a = entrada.nextInt();
	b = entrada.nextInt();

	if (a > b){
		maior = a;
		menor = b;
	} else {
		maior = b;
		menor = a;
	}

	System.out.println("Os números digitados são A = " + a + " B = " + b);
	System.out.println("Maior = " + maior);
	System.out.println("Menor = " + menor);
	System.out.println();
	System.out.println("O programa tem porta!");

	}
}
