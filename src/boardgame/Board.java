package boardgame;

public class Board { // tabuleiro

	private int rows; // linhas
	private int columns; // colunas
	private Piece[][] pieces; // matriz de pe�as

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; // instanciando a matriz de pe�as
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public Piece piece(int row, int column) {
		return pieces[row][column];
	}

	// Sobrecarga do m�todo "piece(int row, int column);"
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
		
	//M�todo que atribui determinada pe�a � sua posi��o
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

}
