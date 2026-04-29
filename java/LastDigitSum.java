import java.util.Scanner;
public class LastDigitSum
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();
		
		int lastDigit1 = num1 % 10;
		int lastDigit2 = num2 % 10;
		
		int sum = lastDigit1 + lastDigit2;
		
		System.out.println("Sum of last Digits: " + sum);
	}
}