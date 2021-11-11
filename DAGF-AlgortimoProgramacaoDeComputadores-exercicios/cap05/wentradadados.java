import javax.swing.JOptionPane;

public class wentradadados {

	public static void main(String args[]){

	String entrada;
	int a,b;
	double x,y;

	entrada = JOptionPane.showInputDialog("Digite um número inteiro A:");
	a = Integer.parseInt(entrada);

	entrada = JOptionPane.showInputDialog("Digite um número inteiro B:");
	b = Integer.parseInt(entrada);

	x = (double)a + (double)b /100;
	y = ((double)a + (double)b) / 100;


	JOptionPane.showMessageDialog(null, "A = " + a + " B = " +b + " X = "+ x + " Y = "+ y, "Mensagem",JOptionPane.PLAIN_MESSAGE);
	
	System.exit(0);

	}
}
