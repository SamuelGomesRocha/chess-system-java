package chess;

//Classe que trata as exce��es da camada de xadrez
public class ChessException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ChessException(String msg) {
		super(msg);
	}
	
}
