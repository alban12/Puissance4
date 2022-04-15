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
	private int player1;
	private int player2;
	private String gameResult;
	private int nb_action;
	private int nb_col;
	private int nb_row;
	
	public Game(int nb_row, int nb_col, int inarow, int player1, int player2)
	{
		this.nb_row = nb_row;
		this.nb_col = nb_col;
		this.inarow = inarow;
	}
	
	
	public void start()
	{
		setBoard(new Board(this.nb_row, this.nb_col));
		this.nb_action = 0;
	}
	
	public void play_col(int col)
	{
		this.board.drop_piece(col, this.get_player());
	}

	
	public boolean proceed() {
		// Check if there is a win 
		
		// If the board has a winning position 
		// return false and set gameResult to ...
		if (this.board.areFourConnected(this.get_player())) {
			this.gameResult = "Player : "+this.get_player()+" has won";
			return false;
		}
		// If the board has no more space 
		// return false and set gameResult to : draw
		this.nb_action += 1;
		return true;
	}

	/**
	 * @return the inarow
	 */
	public int getInarow() {
		return inarow;
	}

	public int get_player() {
		return this.nb_action % 2;
	}
	
	public int get_first_available_row(int col) {
		int[][]  rep = this.board.getRepresentation();
		for (int i = this.nb_row - 1; i >= 0; i--) {
			if (rep[i][col] == -1) {
				return i;
			}
		}
		return -1;
		
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
