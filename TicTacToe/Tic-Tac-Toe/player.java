import board.*;
import java.util.Scanner;

public class player{

	static Scanner input = new Scanner(System.in);
	static board b;
	
	char marker;
	boolean isHuman;
	
	public player()
	{
		marker = 'X';
		isHuman = true;
	}

	public player(boolean inIsHuman)
	{
		isHuman = inIsHuman;

		if(inIsHuman == true)
		{
			marker = 'X';
		}
		else
		{
			marker = 'O';
		}
	}
	public player (boolean inIsHuman, char inMarker)
	{
		isHuman = inIsHuman;

		if(inMarker == 'x' || inMarker == 'X' )
		{
			marker = 'X';
		}
		else
		{
			marker = 'O';
		}


	}

	public char getMarker()
	{
		return marker;
	}
	public boolean getisHuman()
	{
		return isHuman;
	}  

	public String getHumanMove()
	{
		String move; 
		System.out.print("Player Move (X): ");
		move = input.nextLine();
		
		return move;
	}

	public String generateComputerMove()
	{
		char[][] gameBoard = b.getgameBoard();
		System.out.print("Computer Move (O): ");
		if(gameBoard[1][1]==0)
			return "B2";
		else if(gameBoard[0][0] == 0)
			return "A1";
		else if(gameBoard[0][2] == 0)
			return "C1";
		else if(gameBoard[0][1] == 0)
			return "B1";
		else if(gameBoard[1][2] == 0)
			return "C2";
		else if(gameBoard[2][0] == 0)
			return "A3";
		else if(gameBoard[2][2] == 0)
			return "C3";
		else if(gameBoard[2][1] == 0)
			return "B3";
		else
			return "A2";
	}

	public static void main(String[] args) 
	{

		
		char[][] inBoard = new char[3][3];
		b = new board(inBoard);
		player p = new player();

		int pMove=0, cMove=0; 

		while(true)
		{
			while(true)
			{
				String humanMove = p.getHumanMove();
				if(b.isMoveValid(humanMove) == true)
				{
					if(b.submitMove(humanMove, p.getMarker()) == true)
					{
						b.printBoard();
						pMove++;
						break;
					}
						
					else
					{
						System.out.println("The space entered is already taken.");
						continue;
					}
				}
				else
				{
					System.out.println("Invalid Input: Please enter the column and row of your move (Example: A1).");
					continue;
				}
				
			}

			if(pMove >= 3)
			{
				if(b.isWinner(p.getMarker()) == true)
				{
					System.out.println("You win!");
					break;
				}
			}

			String comMove = p.generateComputerMove();
			System.out.println(comMove);
			b.submitMove(comMove, 'O');
			b.printBoard();
			cMove++;
			//System.out.println(pMove+" "+cMove);

			if(cMove >= 3)
			{
				if(b.isWinner('O') == true)
				{
					System.out.println("Computer wins!");
					break;
				}
			}
			if(pMove+ cMove > 9)
			{
				if(b.isCat((pMove+ cMove)) == true)
				System.out.println("Game tied!");
				break;
			}
		}


	}
}