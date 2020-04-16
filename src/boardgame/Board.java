package boardgame;

public class Board { // tabuleiro

	private int rows; // linhas
	private int columns; // colunas
	private Piece[][] pieces; // matriz de peças

	public Board(int rows, int columns) {
	//Programação defensiva: lançando exceção que irá alertar sobre tabuleiros 
	//com menos de uma linha e uma coluna;
		if(rows < 1 || columns < 1)
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; // instanciando a matriz de peças
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) {
		//Programação defensiva: lançando exceção que irá alertar sobre posições que não existem
		if(!positionExists(row, column))
			throw new BoardException("Position not on the board!");
		return pieces[row][column];
	}

	// Sobrecarga do método "piece(int row, int column);"
	public Piece piece(Position position) {
		//Programação defensiva: lançando exceção que irá alertar sobre posições que não existem
		if(!positionExists(position))
			throw new BoardException("Position not on the board!");
		return pieces[position.getRow()][position.getColumn()];
	}

	// Método que atribui determinada peça à sua posição
	public void placePiece(Piece piece, Position position) {
		//Programação defensiva: lançando exceção que irá alertar sobre posições que já estão ocupadas por uma peça
		if(thereIsAPiece(position))
			throw new BoardException("There is already a piece on position "+position);
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	// Para testar a existência de uma posição
	private boolean positionExists(int row, int column) {
		return row >= 0 && row <= rows && column >= 0 && column <= columns;
	}

	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		//Programação defensiva: lançando exceção que irá alertar sobre posições que não existem
		if(!positionExists(position))
			throw new BoardException("Position not on the board!");
	 return piece(position) != null;
	}
}
