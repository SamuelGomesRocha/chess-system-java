package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

//partida de xadrez
public class ChessMatch {

	private Board board;

	public ChessMatch() {
		/*
		 * Delegando opera��es: a classe "ChessMatch" � a respons�vel pela instancia��o
		 * das dimens�es do objeto "tabuleiro".
		 */
		board = new Board(8, 8);
		initialSetup();
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
	
	//Iniciar� a partida de xadrez inserindo as pe�as no tabuleiro
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 0));
		board.placePiece(new King(board, Color.BLACK), new Position(7, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(0, 4));

	}
	
}
