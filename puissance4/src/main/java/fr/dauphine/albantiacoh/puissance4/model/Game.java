/**
 * 
 */
package fr.dauphine.albantiacoh.puissance4.model;

/**
 * @author albantiacoh
 *
 */
public class Game {
	private Board board;
	private int inarow;
	private Player player1;
	private Player player2;
	private String gameResult;
	
	public Game(int col,int row,int inarow,Player player1,Player player2)
	{
		setBoard(new Board(col,row));
		this.inarow=inarow;
	}
	
	
	public void start()
	{
		// Succession of plays 
		// Use the method from the board, which knows if there is space for another piece to be played 
	}


	/**
	 * @return the inarow
	 */
	public int getInarow() {
		return inarow;
	}


	/**
	 * @param inarow the inarow to set
	 */
	public void setInarow(int inarow) {
		this.inarow = inarow;
	}


	public Board getBoard() {
		return board;
	}


	public void setBoard(Board board) {
		this.board = board;
	}

}
