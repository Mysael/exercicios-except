package questao05;

import java.util.Scanner;

public class AvaliacaoApp
{
	public static void main(String[] args) 
	{	Scanner teclado = new Scanner(System.in);
		Avaliacao avaliacao = new Avaliacao();
		boolean nota1Ok;
		boolean nota2Ok;
		do {
			
		
		System.out.print("Digite nota do estágio 1: ");
		try {
			avaliacao.setNota1(teclado.nextDouble());
			nota1Ok= false;
			
		} catch (NotaInvalidaException e) {
			System.out.println(e.getMessage());
			nota1Ok = true;
		}
		} while (nota1Ok);
		
		do {
			
		System.out.print("Digite nota do estágio 2: ");
		try {
			avaliacao.setNota2(teclado.nextDouble());
			System.out.println("Média: " + avaliacao.getMedia());
			nota2Ok = false;
		} catch (NotaInvalidaException e) {
			System.out.println(e.getMessage());
			
			nota2Ok = true;
		}
		
		
		} while (nota2Ok);
		teclado.close();
	}
}
