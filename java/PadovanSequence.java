import java.util.Scanner;
public class PadovanSequence 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Padovan terms to display: ");
        int n = scanner.nextInt();

        if (n <= 0) 
		{
            System.out.println("Enter a positive integer.");
            return;
        }

        int[] padovan = new int[n];

        if (n >= 1) padovan[0] = 1;
        if (n >= 2) padovan[1] = 1;
        if (n >= 3) padovan[2] = 1;

        for (int i = 3; i < n; i++) 
		{
            padovan[i] = padovan[i - 2] + padovan[i - 3];
        }

        System.out.println("Padovan Sequence:");
        for (int i = 0; i < n; i++) 
		{
            System.out.print(padovan[i] + " ");
        }
    }
}