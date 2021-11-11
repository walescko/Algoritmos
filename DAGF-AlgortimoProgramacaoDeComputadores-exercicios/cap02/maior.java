import java.util.*;
public class prog1{
	public prog1(){
}

public static void main(String[] args){
	int x,y;
	Scanner entrada;
	entrada = new Scanner(System.in);
	x = entrada.nextInt();
	entrada = new Scanner(System.in);
	y = entrada.nextInt();
	
	if (x >y){
		System.out.println(x);
	} else {
		System.out.println(y);
	}
	}
}
