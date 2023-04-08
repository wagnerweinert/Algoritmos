import java.util.Scanner;

public class TomadaDecisaoPorSelecao {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int mes;

        System.out.println("Digite o mês:");
	    mes = teclado.nextInt();
        switch(mes){
            case 1: {
                System.out.println("Janeiro");
                break;
            }
            case 2: {
                System.out.println("Fevereiro");
                break;
            }
            case 3: {
                System.out.println("Março");
                break;
            }
            default:{
                System.out.println("Mês Inválido");                
                
            }
        }			
	}}
