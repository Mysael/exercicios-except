package questao03;

public class DataInvalidaException extends Exception{
	public DataInvalidaException(){
		super("Os parâmetros fornecidos não representam uma data válida");
	}
	
}
