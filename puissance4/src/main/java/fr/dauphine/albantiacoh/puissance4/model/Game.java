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
		board = new Board(col,row);
		this.inarow=inarow;
	}
	
	
	public void start()
	{
		//do 
		//{
			//Switch player to know if it is a human, so you wait for the viewController to give the move to put 
			int action_played = player1.action(board);
			board.add_piece(action_played,1);
			//viewController.updateSceneWith(action_played)
			
			//Agent takes turn make choice of col to drop  
			//board.drop_piece(col, piece);
		//} while() //There is still no winner, and you still can drop a piece 
		//gameResult=....
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

}
