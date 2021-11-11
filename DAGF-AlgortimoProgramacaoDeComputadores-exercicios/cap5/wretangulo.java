import java.util.*;
import javax.swing.*;

public class wretangulo{
	public static void main (String args[]){

	  int base, altura, area;
	  String entrada; 
	  
	  entrada = JOptionPane.showInputDialog("Digite o valor da base .....: ");
	  base = Integer.parseInt(entrada);
	  
	  entrada = JOptionPane.showInputDialog("Digite o valor da altura ...: ");
	  altura = Integer.parseInt(entrada);

	  area = base * altura;

	  JOptionPane.showMessageDialog(null, "Área do Quadrilátero = " +area, "Resultado", JOptionPane.PLAIN_MESSAGE);
	  

	  JOptionPane.showMessageDialog(null,"Terminou o programa"," ",JOptionPane.PLAIN_MESSAGE);

	  }
}
