package loops;
import java.util.Scanner;
public class BreakEContinue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite");
		int max = scan.nextInt();
		
		for (int i=num; i<=max; i++) {
			if (i% 7 == 0) {
				System.out.println("o valor de i é " + i);
				break;
				//sem o break, o loop ficaria até o final!!
			}
		}
		
	
 scan.close();
}
}
