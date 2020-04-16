package boardgame;

//RuntimeException: para o tratamento opcional de erros 
public class BoardException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public BoardException(String msg) {
		super(msg);
	}

}
