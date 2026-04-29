import java.util.Scanner;
public class FibonacciSearch
{

    static int fib(int k) 
	{
        if (k <= 1) return k;
        return fib(k - 1) + fib(k - 2);
    }

    static int fibK(int n) 
	{
        int k = 0;
        while (fib(k) < n) 
		{
            k++;
        }
        return k;
    }

    static int fibonacciSearch(int[] arr, int n, int s) 
	{
        int k = fibK(n);

        int offset = -1;

        while (k > 0) 
		{
            int i = Math.min(offset + fib(k - 2), n - 1);

            if (s == arr[i]) 
			{
                return i; 
            } 
			else if (s > arr[i]) 
			{
                k = k - 1;
                offset = i; 
            } 
			else 
			{
                k = k - 2; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
		
        int[] arr = new int[n];
        System.out.println("Enter sorted array elements:");
		
        for (int i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int s = sc.nextInt();

        int pos = fibonacciSearch(arr, n, s);
        if (pos != -1)
            System.out.println("Element found at index: " + pos);
        else
            System.out.println("Element not found");

        sc.close();
    }
}

