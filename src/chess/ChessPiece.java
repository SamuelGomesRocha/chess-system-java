package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece { // subclasse de peça
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	// não há "set" da cor, pois ela não poderá ser modificada, apenas acessada.
	public Color getColor() {
		return color;
	}

}
