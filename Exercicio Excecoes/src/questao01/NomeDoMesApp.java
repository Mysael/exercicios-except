package questao01;

import java.util.Scanner;

public class NomeDoMesApp 
{
	public static void main(String[] args)  
	{	Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o n�mero do m�s: ");
		Mes mes;
		try {
			mes = new Mes(teclado.nextInt());
			System.out.println("Nome do m�s: " + mes.getNome());
		} catch (MesInvalidoException mie) {
			System.out.println(mie.getMessage());
		}
	 	teclado.close();
	}
}
