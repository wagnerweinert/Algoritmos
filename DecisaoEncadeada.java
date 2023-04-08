import java.util.Scanner;

public class DecisaoEncadeada {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double SA,NS;

        System.out.println("Digite o Salário:");
	    SA = teclado.nextFloat();
        if (SA<500){
            NS=SA*1.15;
        }
        else{
            if(SA<=1000){
                NS=SA*1.10;
            }
            else{
                NS=SA*1.05;
            }
        }
        System.out.println("Novo Salário:" + NS);			
	}
}
