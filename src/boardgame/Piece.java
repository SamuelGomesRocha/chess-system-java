package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {//sem a posição, pois a posição inicial é nula
		this.board = board;
	}
	
	//protected: acessado somente no pacote tabuleiro e por subclasses de peça
	protected Board getBoard() { 
		return board;
	}
	
}
