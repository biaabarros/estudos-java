package condicional;
import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indique sua idade");
        int idade = scan.nextInt();
        
        if (idade >= 18) {
        	System.out.println("Você é maior de idade.");        		
        } else {
        	System.out.println("Não é maior de idade.");
        	
        }
         
        System.out.println("indique o valor do produto.");
        double valor = scan.nextInt();
        
        if (valor <= 10) {
        	System.out.println("compre.");
        } else if (valor < 10 && valor > 15) {
        	System.out.println("peça um desconto.");
        } else if (valor >= 15 && valor < 17) {
        	System.out.println("pesquise mais.");
        } else {
        	System.out.println("está muito caro.");
        }
        
        
        scan.close();
	}

}
