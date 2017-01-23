package board;
import java.util.*;


public class board
{

	public char gameBoard[][];
	
	int i, j;

	public board()
	{

	}
	public board(char[][] inBoard)
	{
		
		gameBoard = inBoard;

		System.out.println("************\nTic-Tac-Toe!\n************");
		System.out.println("\nPlase enter the column then row of your move.\n");
		System.out.println("   A B C");
		for(i=0; i<3; i++)
		{
			System.out.print(i+1+" |");
			for(j=0; j<3; j++)
				System.out.print(gameBoard[i][j]+" |");
			System.out.println("\n---------");
		}

	}

	public char[][] getgameBoard()
	{
		return gameBoard;
	}

	public void printBoard()
	{
		System.out.println("  A\tB\tC");
		for(i=0; i<3; i++)
		{
			System.out.print(i+1+" |");
			for(j=0; j<3; j++)
				System.out.print("  "+gameBoard[i][j]+" \t|");
			System.out.println("\n-------------------------");

		}
	}

	public boolean submitMove(String move, char player)
	{
		if(move.equals("A1") || move.equals("A2") || move.equals("A3"))
		{
			j = 0;
		}

		else if(move.equals("B1") || move.equals("B2") || move.equals("B3"))
		{
			j = 1;
		}

		else if(move.equals("C1") || move.equals("C2") || move.equals("C3"))
		{
			j = 2;
		}

		i = Character.getNumericValue(move.charAt(1));
		i--;
		
		if(gameBoard[i][j] != 0)
		{
			return false;
		}

		else
		{
			gameBoard[i][j] = player;
			return true;
		}
		
		
	}
			
	public boolean isWinner(char player)
	{
		if(gameBoard[0][0]==player  && gameBoard[1][1]==player && gameBoard[2][2]==player)
			return true;
		else if(gameBoard[0][0]==player  && gameBoard[0][1]==player && gameBoard[0][2]==player)
			return true;
		else if(gameBoard[0][0]==player  && gameBoard[1][0]==player && gameBoard[2][0]==player)
			return true;
		else if(gameBoard[1][0]==player  && gameBoard[1][1]==player && gameBoard[1][2]==player)
			return true;
		else if(gameBoard[2][0]==player  && gameBoard[2][1]==player && gameBoard[2][2]==player)
			return true;
		else if(gameBoard[0][1]==player  && gameBoard[1][1]==player && gameBoard[2][1]==player)
			return true;
		else if(gameBoard[0][2]==player  && gameBoard[1][1]==player && gameBoard[2][0]==player)
			return true;
		else if(gameBoard[1][0]==player  && gameBoard[1][1]==player && gameBoard[1][2]==player)
			return true;
		else if(gameBoard[0][2]==player  && gameBoard[1][2]==player && gameBoard[2][2]==player)
			return true;
		else
			return false;



	}

	public boolean isCat(int n)
	{
		if(n > 9)
			return true;
		else
			return false;
	}

	public boolean isMoveValid(String move)
	{
		if(move.equals("A1") || move.equals("A2") || move.equals("A3") || move.equals("B1") || move.equals("B2") || move.equals("B3") || move.equals("C1") || move.equals("C2") || move.equals("C3"))
		{
 			return true;
		}

		else
		{
			return false;
		}
	}
}