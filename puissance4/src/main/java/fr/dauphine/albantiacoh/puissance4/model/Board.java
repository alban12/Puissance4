/**
 * 
 */
package fr.dauphine.albantiacoh.puissance4.model;

/**
 * @author albantiacoh
 *
 */
public class Board {
	private int col;
	private int row;
	private Mark[][] representation;
	private Mark piece;
	
	public Board(int col, int row) {
		// TODO Auto-generated constructor stub
	}
	
	public int windows_number()
	{
		return 0;
	}
	
	public void drop_piece(int col, Mark piece)
	{
		
	}
	
	/**
	 * @return the col
	 */
	public int getCol() {
		return col;
	}

	/**
	 * @return the row
	 */
	public int getRow() {
		return row;
	}

	/**
	 * @return the representation
	 */
	public Mark[][] getRepresentation() {
		return representation;
	}

	/**
	 * @return the piece
	 */
	public Mark getPiece() {
		return piece;
	}

	/**
	 * @param col the col to set
	 */
	public void setCol(int col) {
		this.col = col;
	}

	/**
	 * @param row the row to set
	 */
	public void setRow(int row) {
		this.row = row;
	}

	/**
	 * @param representation the representation to set
	 */
	public void setRepresentation(Mark[][] representation) {
		this.representation = representation;
	}

	/**
	 * @param piece the piece to set
	 */
	public void setPiece(Mark piece) {
		this.piece = piece;
	}

	public void add_piece(int action_played,int player) {
		// TODO Auto-generated method stub
		for(int row=0;row<this.row;row++)
		{
			if (this.representation[row][action_played]!=Mark.EMPTY) 
				{
					this.representation[row-1][action_played]=Mark.ofPlayer(1);
				}
			else if (row==this.row-1)
			{
				this.representation[row][action_played]=Mark.ofPlayer(1);
			}
		}
	}
}