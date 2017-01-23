public class output extends addition{

	protected int sum;
	protected void show()
	{
		System.out.println("\nSum: "+(a+b));
	}

	public static void main(String[] args) {

		output o = new output();
		o.getInput();
		o.doAddition();
		o.show();

			
	}
}