package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece { // subclasse de pe�a
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	// n�o h� "set" da cor, pois ela n�o poder� ser modificada, apenas acessada.
	public Color getColor() {
		return color;
	}

}
