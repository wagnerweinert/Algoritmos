import java.util.Scanner;
import java.lang.Math;

public class Formas {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int valor,q;
        double c;

        System.out.println("Digite um valor");
	    valor = teclado.nextInt();
        q = valor * valor;
        c = Math.pow(valor,3);
        System.out.println("O quandrado é: " + q);
        System.out.println("O cubo é: " + c);
			
	}

}
