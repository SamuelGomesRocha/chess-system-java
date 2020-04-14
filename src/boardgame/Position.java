package boardgame; //tabuleiro

public class Position {
	private int row; //linha
	private int column; //coluna
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override //sobrescrita do método toString que é da classe Object
	public String toString() {
		return row + ", "+column; //imprime uma posição na tela
	}
	
}
