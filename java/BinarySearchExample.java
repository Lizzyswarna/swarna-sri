import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, key);

        if (result == -1) 
		{
            System.out.println("Element not found.");
        } 
		else 
		{
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }

    public static int binarySearch(int[] arr, int key) 
	{
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) 
		{
            int mid = low + (high - low) / 2; 

            if (arr[mid] == key) 
			{
                return mid; 
            }
            if (arr[mid] < key) 
			{
                low = mid + 1; 
            } 
			else 
			{
                high = mid - 1; 
            }
        }
        return -1;
    }
}
