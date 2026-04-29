import java.util.Scanner;
public class SecondLastDigit
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		number = Math.abs(number);
		
		if (number < 10)
		{
			System.out.println("There is no second last digit.");
		}
		else
		{
			int result = (number / 10) % 10;
			System.out.println("Second last digit: " + result);
		}
	}
}