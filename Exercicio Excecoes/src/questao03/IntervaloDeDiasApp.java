package questao03;

import java.util.Scanner;

public class IntervaloDeDiasApp 
{
	public static void main(String[] args) 
	{	Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o dia: ");
		int dia = teclado.nextInt();
		System.out.print("Digite o m�s: ");
		int mes = teclado.nextInt();
		System.out.print("Digite o ano: ");
		int ano = teclado.nextInt();
		try{
		Data data = new Data(dia, mes, ano);
		System.out.println("Faltam " + data.getQuantidadeDeDias() + " dia(s) para a data " + dia + "/" + mes + "/" + ano);
		}
		catch (Exception die) {
			System.out.println(die.getMessage());
		}
	 	teclado.close();
	}
}
