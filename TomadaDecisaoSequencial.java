import java.util.Scanner;

public class TomadaDecisaoSequencial {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int n;
        
        System.out.println("Digite um valor para n:");
	    n = teclado.nextInt();
        if (n==1){
            System.out.println("Valor 1");
        }
        if (n==2){
            System.out.println("Valor 2");
        }
        if (n<1){
            System.out.println("Valor Baixo");
        }
        if (n>2){
            System.out.println("Valor Alto");
        }			
	}

}
