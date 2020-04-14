package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {//sem a posi��o, pois a posi��o inicial � nula
		this.board = board;
	}
	
	//protected: acessado somente no pacote tabuleiro e por subclasses de pe�a
	protected Board getBoard() { 
		return board;
	}
	
}
