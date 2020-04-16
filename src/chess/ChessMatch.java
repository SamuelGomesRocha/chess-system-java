package chess;

import boardgame.Board;
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
	
	//colocar pe�as utilizando as coordenadas do xadrez
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	
	
	//Iniciar� a partida de xadrez inserindo as pe�as no tabuleiro
	private void initialSetup() {
		//Utilizando as coordenadas do xadrez para posicionar as pe�as
		placeNewPiece('a', 1, new Rook(board, Color.WHITE));
		placeNewPiece('d', 8, new King(board, Color.BLACK));
		placeNewPiece('d', 1, new King(board, Color.WHITE));

	}
	
}
