package application;

import chess.ChessPiece;

//UI: User Interface
public class UI {
	
	public static void printBoard(ChessPiece[][] pieces) {
		for(int i = 0; i < pieces.length; i++) {
			System.out.print((8-i)+" ");
			for(int j = 0; j< pieces.length; j++) {//A matriz será quadrada
				printPiece(pieces[i][j]);
			
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	//Imprime uma única peça
	private static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
