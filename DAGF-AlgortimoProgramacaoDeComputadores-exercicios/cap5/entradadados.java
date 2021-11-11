import javax.swing.JOptionPane;

public class entradadados {

	public static void main(String args[]){

	String entrada;
	int numero;

	entrada = JOptionPane.showInputDialog("Digite um inteiro:");

	numero = Integer.parseInt(entrada);

	JOptionPane.showMessageDialog(null, "Numero digitado =" + numero, "Mensagem",JOptionPane.PLAIN_MESSAGE);
	
	System.exit(0);

	}
}
