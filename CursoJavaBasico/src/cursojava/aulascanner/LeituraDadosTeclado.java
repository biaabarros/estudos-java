package cursojava.aulascanner;
import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
		System.out.println("digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("seu nome completo é: " + nomeCompleto);
}
}