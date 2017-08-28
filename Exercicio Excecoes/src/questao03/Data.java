package questao03;

import java.util.Date;
import java.util.GregorianCalendar;


public class Data 
{
	public static final long MILISECONDS_PER_DAY = 60 * 60 * 24 * 1000;
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) throws DataInvalidaException{
		if(dia < 1 || dia >31){
			throw new DataInvalidaException();
		}
		this.dia = dia;
		if(ano %4 != 0 && mes == 2 && dia > 28){
			throw new DataInvalidaException();
		}
		if(dia > 30 && mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11){
			throw new DataInvalidaException();
		}
		if(mes <1 || mes > 12){
			throw new DataInvalidaException();
		}
		this.mes = mes;
		if(ano >1){
			throw new DataInvalidaException();
		}
		this.ano = ano;
	}
	
	public long getQuantidadeDeDias()
	{	Date data = new Date(new GregorianCalendar(ano, mes - 1, dia).getTimeInMillis());
		Date agora = new Date();
		return (data.getTime() - agora.getTime()) / MILISECONDS_PER_DAY;
	}
	
	/*private boolean isBissexto(int ano)
	{	return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));	
	}
	
	private boolean temTrintaDias(int mes)
	{	return mes == 4 || mes == 6 || mes == 9 || mes == 11;
	}*/
}
