import java.util.Scanner;
class input{

	protected int a,b;

	protected void getInput()
	{
		Scanner in = new Scanner(System.in);

		System.out.print("a: ");
		a = in.nextInt();
		System.out.print("\nb: ");
		b = in.nextInt();
	}
	
}