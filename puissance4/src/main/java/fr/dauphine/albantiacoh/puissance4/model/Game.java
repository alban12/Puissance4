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
	
	public Game(int col,int row,int inarow)
	{
		board = new Board(col,row);
		this.inarow=inarow;
	}

}
