package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

//Classe referente à torre
public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
	} 

	@Override
	public String toString() {
		return "R"; //R = Rook
	}
}
