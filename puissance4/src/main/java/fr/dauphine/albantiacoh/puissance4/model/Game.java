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
	private int nb_action;
	private int nb_col;
	private int nb_row;
	
	public Game(int nb_col,int nb_row,int inarow,int player1,int player2)
	{
		this.nb_col = nb_col;
		this.nb_row = nb_row;
		this.inarow = inarow;
	}
	
	
	public void start()
	{
		setBoard(new Board(this.nb_col, this.nb_row));
		this.nb_action = 0;
	}
	
	public void play_col(int col)
	{
		this.board.drop_piece(col, this.get_player());
	}

	
	public void proceed() {
		this.nb_action += 1;	
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
