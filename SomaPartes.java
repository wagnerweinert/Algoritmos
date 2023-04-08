import java.util.Scanner;

public class SomaPartes {
    public static void main(String[] args) {
	
		int entrada, d, c, u, soma, resto;
		Scanner teclado = new Scanner(System.in);

			System.out.println("Digite o valor de entrada: ");
			entrada = teclado.nextInt();
			d=entrada/100;
            resto=entrada%100;
            c=resto/10;
            u=resto%10;
            soma=d+c+u;
			System.out.println("Soma: " + soma);
	
	}

    
}
