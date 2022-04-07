/**
 * 
 */
package fr.dauphine.albantiacoh.puissance4.model;

/**
 * @author albantiacoh
 *
 */
public class Board {
	private int nb_col;
	private int nb_row;
	private int[][] representation;
	private int piece;
	
	public Board(int nb_row, int nb_col) {
		// TODO Auto-generated constructor stub
		this.representation = new int[nb_row][nb_col];
		for (int i = 0; i < nb_row; i++) {
			for (int j = 0; j < nb_col; j++) {
				representation[i][j] = -1;
			}
		}
		this.nb_row = nb_row;
		this.nb_col = nb_col;
	}
	
	public int windows_number()
	{
		return 0;
	}
	
	public void drop_piece(int col, int piece)
	{
		// int[][]  rep = this.board.getRepresentation();
		System.out.println(this.representation);
		System.out.println("In drop piece");
		for (int i = this.nb_row - 1; i >= 0; i--) {
			System.out.println(this.representation[i][col]);
			if (this.representation[i][col] == -1) {
				this.representation[i][col] = piece;
				System.out.println(this.representation);
				return;
			}
		}
	}
	
	/**
	 * @return the col
	 */
	public int getCol() {
		return nb_row;
	}

	/**
	 * @return the row
	 */
	public int getRow() {
		return nb_row;
	}

	/**
	 * @return the representation
	 */
	public int[][] getRepresentation() {
		return representation;
	}

	/**
	 * @return the piece
	 */
	public int getPiece() {
		return piece;
	}

	/**
	 * @param col the col to set
	 */
	public void setCol(int col) {
		this.nb_col = col;
	}

	/**
	 * @param row the row to set
	 */
	public void setRow(int row) {
		this.nb_row = row;
	}

	/**
	 * @param representation the representation to set
	 */
	public void setRepresentation(int[][] representation) {
		this.representation = representation;
	}

	/**
	 * @param piece the piece to set
	 */
	public void setPiece(int piece) {
		this.piece = piece;
	}

	/*
	 * public void add_piece(int action_played,int player) { // TODO Auto-generated
	 * method stub for(int row=0;row<this.row;row++) { if
	 * (this.representation[row][action_played]!=Mark.EMPTY) {
	 * this.representation[row-1][action_played]=Mark.ofPlayer(1); } else if
	 * (row==this.row-1) { this.representation[row][action_played]=Mark.ofPlayer(1);
	 * } } }
	 */
}