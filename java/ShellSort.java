public class ShellSort 
{
    public static void shellSort(int[] A) 
	{
        int n = A.length;

        for (int gap = n / 2; gap >= 1; gap = gap / 2) 
		{
            
            for (int j = gap; j < n; j++) 
			{
                
                for (int i = j - gap; i >= 0; i = i - gap) 
				{
                    
                    if (A[i + gap] >= A[i]) 
					{
                        break;
                    } 
					else 
					{
                        int temp = A[i];
                        A[i] = A[i + gap];
                        A[i + gap] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) 
	{
        int[] arr = {23, 12, 1, 8, 34, 54, 2, 3};
        
        System.out.println("Before Sorting:");
        for (int num : arr) 
		{
            System.out.print(num + " ");
        }

        shellSort(arr);

        System.out.println("\nAfter Sorting:");
        for (int num : arr) 
		{
            System.out.print(num + " ");
        }
    }
}
