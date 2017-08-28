package questao01;

import java.util.Scanner;

public class NomeDoMesApp 
{
	public static void main(String[] args)  
	{	Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o número do mês: ");
		Mes mes;
		try {
			mes = new Mes(teclado.nextInt());
			System.out.println("Nome do mês: " + mes.getNome());
		} catch (MesInvalidoException mie) {
			System.out.println(mie.getMessage());
		}
	 	teclado.close();
	}
}
