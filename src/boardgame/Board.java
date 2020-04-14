package boardgame;

public class Board { //tabuleiro
	
	private int rows; //linhas
	private int columns; //colunas
   	private Piece[][] pieces; //matriz de peças
	
   	
   	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; //instanciando a matriz de peças
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
	
   	
   	
}
