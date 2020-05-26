package repeticao;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		int i;
		int rep =  1;
		int maior = 0;
		
		
		Scanner leitor= new Scanner (System.in);
		
		
		while (rep <= 15) {
			System.out.println("Digite um número: ");
			i = leitor.nextInt();
		
		
			rep++;
		
		
			if (i > maior) {
			
			i = maior;
			
			}
				System.out.println();
				System.out.println("Maior: " + maior);
		
		

}
}
}		
		
		
		