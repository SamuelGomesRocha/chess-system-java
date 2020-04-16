package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

//partida de xadrez
public class ChessMatch {

	private Board board;

	public ChessMatch() {
		/*
		 * Delegando operações: a classe "ChessMatch" é a responsável pela instanciação
		 * das dimensões do objeto "tabuleiro".
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
		// Retorna a matriz de peças da partida de xadrez;
		return mat;
	}
	
	//colocar peças utilizando as coordenadas do xadrez
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	
	
	//Iniciará a partida de xadrez inserindo as peças no tabuleiro
	private void initialSetup() {
		//Utilizando as coordenadas do xadrez para posicionar as peças
		placeNewPiece('a', 1, new Rook(board, Color.WHITE));
		placeNewPiece('d', 8, new King(board, Color.BLACK));
		placeNewPiece('d', 1, new King(board, Color.WHITE));

	}
	
}
