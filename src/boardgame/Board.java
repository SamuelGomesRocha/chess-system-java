package boardgame;

public class Board { // tabuleiro

	private int rows; // linhas
	private int columns; // colunas
	private Piece[][] pieces; // matriz de peças

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; // instanciando a matriz de peças
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

	// Sobrecarga do método "piece(int row, int column);"
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
		
	//Método que atribui determinada peça à sua posição
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

}
