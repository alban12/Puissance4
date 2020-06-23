package fr.dauphine.albantiacoh.puissance4.model;

/**
 * @author albantiacoh
 *
 */
public enum Mark {
		EMPTY,WHITE,BLUE;
		
		
		public static Mark ofPlayer(int player)
		{
			if (player==1)
			{
				return WHITE;
			}
			else if (player == 2)
			{
				return BLUE;
			}
			return null;
		}
}
