import java.util.Scanner;

public class DesvioCondicionalComposto {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int a,b,x,r;

        System.out.println("Digite um valor para a");
	    a = teclado.nextInt();
        System.out.println("Digite um valor para B");
	    b = teclado.nextInt();
        x=a+b;
        if (x>10){
            r=x+5;           2
            
        }		
        else{
            r=x-7;
        }
        System.out.println("O valor de x é: " + r);	
	}

}
