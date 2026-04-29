import java.util.Scanner;
public class CombineStrings
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String str1 = scanner.nextLine();
		
		System.out.print("Enter second string: ");
		String str2 = scanner.nextLine();
		
		String result = str1 + " " + str2;
		
		System.out.println("Combined String: " + result);
	}
}