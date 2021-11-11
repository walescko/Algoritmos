import java.util.*;

public class retangulo{
	public static void main (String args[]){

	  int base, altura, area;
	  Scanner entrada_dado = new Scanner(System.in);

	  System.out.print("Digite o valor da base .....: ");
	  base = entrada_dado.nextInt();
	  System.out.print("Digite o valor da altura ...: ");
	  altura = entrada_dado.nextInt();

	  area = base * altura;

	  System.out.print("\nÁrea do Quadrilátero = " +area + "\n");
	  System.out.print("\nTerminou o programa\n");

	  }
}
