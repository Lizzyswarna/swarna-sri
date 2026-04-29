public class QuickSortExample 
{
    public static int partition(int[] A, int lb, int ub) 
	{
        int pivot = A[lb];
        int start = lb;
        int end = ub;

        while (start < end) 
		{
            while (start <= ub && A[start] <= pivot) 
			{
                start++;
            }
            while (A[end] > pivot) 
			{
                end--;
            }
            if (start < end) 
			{
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;
            }
        }

        int temp = A[lb];
        A[lb] = A[end];
        A[end] = temp;

        return end; 
    }

    public static void quickSort(int[] A, int lb, int ub) 
	{
        if (lb < ub) 
		{
            int loc = partition(A, lb, ub);
            quickSort(A, lb, loc - 1);
            quickSort(A, loc + 1, ub);
        }
    }

    public static void main(String[] args) 
	{
        int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };

        System.out.println("Before Sorting:");
        for (int x : arr) 
		{
            System.out.print(x + " ");
        }

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int x : arr) 
		{
            System.out.print(x + " ");
        }
    }
}
