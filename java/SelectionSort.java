public class SelectionSort 
{
    public static void selectionSort(int[] A) 
	{
        int n = A.length;

        for (int i = 0; i <= n - 1; i++) 
		{  
            int min = i;

            for (int j = i + 1; j <= n - 1; j++) 
			{  
                if (A[j] < A[min]) 
				{
                    min = j;
                }
            }

            if (min != i) 
			{
                int temp = A[i];
                A[i] = A[min];
                A[min] = temp;
            }
        }
    }

    public static void main(String[] args) 
	{
        int[] arr = {29, 10, 14, 37, 13};
        
        System.out.println("Original array:");
        for (int num : arr) 
		{
            System.out.print(num + " ");
        }
        
        selectionSort(arr);

        System.out.println("\nSorted array:");
        for (int num : arr) 
		{
            System.out.print(num + " ");
        }
    }
}
