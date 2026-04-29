import java.util.Scanner;

public class LinearSearch 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] A = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
		{
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        int position = -1; 
        for (int i = 0; i < n; i++) 
		{
            if (A[i] == key) 
			{
                position = i; 
                break; 
            }
        }

        if (position != -1) 
		{
            System.out.println("Search is successful! Element found at position: " + (position ));
        } 
		else 
		{
            System.out.println("Search is unsuccessful! Element not found.");
        }

        sc.close();
    }
}


