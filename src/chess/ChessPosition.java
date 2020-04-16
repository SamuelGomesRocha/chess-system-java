package chess;

import boardgame.Position;

//Posição dada pelo usuário, com números (1 - 8) e caracteres (a - h)
public class ChessPosition {
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if(column > 'h' || column < 'a' || row < 1 || row > 8) {
			throw new ChessException("Error instatiating ChessPosition. Valid values are from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	//Conversão de ChessPosition para Position
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8-position.getRow());
	}
	
	
	//Coordenadas
	@Override
	public String toString() {
		return ""+ column + row;
	}
}
