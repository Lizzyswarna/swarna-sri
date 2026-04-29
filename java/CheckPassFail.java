import java.util.Scanner;
public class CheckPassFail
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks :");
		int marks = sc.nextInt();
		
		if (marks >= 30)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		sc.close();
	}
}