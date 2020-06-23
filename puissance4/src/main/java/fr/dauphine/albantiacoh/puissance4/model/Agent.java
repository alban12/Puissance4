package fr.dauphine.albantiacoh.puissance4.model;

import java.util.ArrayList;

/**
 * @author albantiacoh
 *
 */
public class Agent extends Player {

	public Agent(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	//Should give back action (i.e a column) 
	
	
	public Board actionBoardPreview(Board board,int col,int player) //Correspond to action from 
	{
		Board next_board = board;
		next_board.add_piece(col, player);
		return next_board;
	}
	
	//public int getHeuristic(Board board,int player)
	{
	//	int score;
	//	int num_threes=countWindows(board,3);
				
	//	return score;
	}
	
	//public int countWindows(Mark[][] board,int num_discs, int player)
	{
		//int numWindows=0;
		//for (int row=0;row<board.;row++)
		//{
		//	for (int col=0)
		//}
	}
	
	public boolean checkWindow(ArrayList<Mark> window,int num_discs,int player,Game game)
	{
		int piece_number=0;
		int empty_number=0;
		for(Mark k : window)
		{
			if (k==Mark.EMPTY) empty_number++;
			if (k==Mark.ofPlayer(player)) piece_number++;
		}
		return (piece_number == num_discs) && (empty_number==game.getInarow()-num_discs);
	}
}
