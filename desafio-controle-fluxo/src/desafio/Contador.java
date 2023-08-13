package desafio;

import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		
		
		try {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("digite o primeiro número: ");
			int num1 = entrada.nextInt();
			
			System.out.println("digite o segundo número: ");
			int num2 = entrada.nextInt();
			
				
				contar(num1, num2);
				
					
				
				entrada.close();
		} catch (ParametrosInvalidosException e) {
			
			System.out.println("ERRO o primeiro número deve ser menor que o segundo");
		}
		
	}
	
	
	static void contar(int num1, int num2) throws ParametrosInvalidosException {
		
		boolean parametros = num1 < num2;
		if(parametros) {
			
			int contagem = num2 - num1;
			for(int contador = 1; contador <= contagem; contador++) {
				System.out.println("imprimindo o número: " + contador);
			}
		} else {
			throw new ParametrosInvalidosException();
		}
			
		
			
		
	}
	

}
