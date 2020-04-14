package chess;

import boardgame.Board;

//partida de xadrez
public class ChessMatch {

	private Board board;

	public ChessMatch() {
		/*
		 * Delegando opera��es: a classe "ChessMatch" � a respons�vel pela instancia��o
		 * das dimens�es do objeto "tabuleiro".
		 */
		board = new Board(8, 8);
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				// Downcasting: Piece passou a ser do tipo ChessPiece
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		// Retorna a matriz de pe�as da partida de xadrez;
		return mat;
	}

}
