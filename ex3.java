package repeticao;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		
		//vari�veis
		int i = 0 ;
		int soma = 0;
		int media = 0;
		
		Scanner leitor = new Scanner (System.in);
		
		while (i < 3)		{

			System.out.println("Digite um n�mero: ");
			int x = leitor.nextInt();
			i++;
			soma = soma +x;
		  	media = soma /i;
			
		}	
		
		System.out.println("A soma dos n�meros �: " + soma);
	  	System.out.println("A m�dia �: " + media);
		
		
		
		
		}
	}
