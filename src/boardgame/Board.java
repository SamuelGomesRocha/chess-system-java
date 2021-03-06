package boardgame;

public class Board { // tabuleiro

	private int rows; // linhas
	private int columns; // colunas
	private Piece[][] pieces; // matriz de pe�as

	public Board(int rows, int columns) {
	//Programa��o defensiva: lan�ando exce��o que ir� alertar sobre tabuleiros 
	//com menos de uma linha e uma coluna;
		if(rows < 1 || columns < 1)
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; // instanciando a matriz de pe�as
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) {
		//Programa��o defensiva: lan�ando exce��o que ir� alertar sobre posi��es que n�o existem
		if(!positionExists(row, column))
			throw new BoardException("Position not on the board!");
		return pieces[row][column];
	}

	// Sobrecarga do m�todo "piece(int row, int column);"
	public Piece piece(Position position) {
		//Programa��o defensiva: lan�ando exce��o que ir� alertar sobre posi��es que n�o existem
		if(!positionExists(position))
			throw new BoardException("Position not on the board!");
		return pieces[position.getRow()][position.getColumn()];
	}

	// M�todo que atribui determinada pe�a � sua posi��o
	public void placePiece(Piece piece, Position position) {
		//Programa��o defensiva: lan�ando exce��o que ir� alertar sobre posi��es que j� est�o ocupadas por uma pe�a
		if(thereIsAPiece(position))
			throw new BoardException("There is already a piece on position "+position);
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	// Para testar a exist�ncia de uma posi��o
	private boolean positionExists(int row, int column) {
		return row >= 0 && row <= rows && column >= 0 && column <= columns;
	}

	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		//Programa��o defensiva: lan�ando exce��o que ir� alertar sobre posi��es que n�o existem
		if(!positionExists(position))
			throw new BoardException("Position not on the board!");
	 return piece(position) != null;
	}
}
