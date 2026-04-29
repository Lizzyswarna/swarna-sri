import java.util.Scanner;
public class MultipleCheck
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value for N: ");
		int N = scanner.nextInt();
		
		System.out.print("Enter value for M: ");
		int M = scanner.nextInt();
		
		if(M == 0)
		{
			System.out.println("Division by zero is not allowed.");
		}
		else if(N % M == 0)
		{
			System.out.println(N + " is an exact multiple of " + M);
		}
		else
		{
			System.out.println(N + " is not an exact multiple of " + M);
		}
	}
}