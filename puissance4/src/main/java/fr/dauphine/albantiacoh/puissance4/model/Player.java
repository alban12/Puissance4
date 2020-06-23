/**
 * 
 */
package fr.dauphine.albantiacoh.puissance4.model;

import java.util.ArrayList;

/**
 * @author albantiacoh
 *
 */
public class Player {
	public String type;
	public Player(String type)
	{
		this.type=type;
	}
	
	
	public String toString()
	{
		return this.type;
	}
	
	/*
	 * Return the chosen column of the player for the action 
	 */
	public int action(Board board)
	{
		ArrayList<Integer> valid_moves = new ArrayList<Integer>();
		for (int col=0;col<board.getCol();col++)
		{
			if (board.getRepresentation()[0][col]==Mark.EMPTY) //The first row is empty
			{
				valid_moves.add(col);
			}
		}
		return valid_moves.get(0);	
	}
}
