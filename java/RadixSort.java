class RadixSort 
{
    int getMax(int A[], int n) 
	{
        int max = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] > max)
                max = A[i];
        }
        return max;
    }

    void countSort(int A[], int n, int pos) 
	{
        int B[] = new int[n];       
        int count[] = new int[10];   

        for (int i = 0; i < 10; i++)
            count[i] = 0;

        for (int i = 0; i < n; i++)
            count[(A[i] / pos) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) 
		{
            B[count[(A[i] / pos) % 10] - 1] = A[i];
            count[(A[i] / pos) % 10]--;
        }

        for (int i = 0; i < n; i++)
            A[i] = B[i];
    }

    void radixSort(int A[], int n) 
	{
        int max = getMax(A, n);

        for (int pos = 1; max / pos > 0; pos *= 10) 
		{
            countSort(A, n, pos);
        }
    }

    public static void main(String args[]) 
	{
        int A[] = {170, 45, 75, 90, 802, 24, 2, 66};
        int n = A.length;

        RadixSort rs = new RadixSort();

        System.out.println("Original Array:");
        for (int num : A) 
		{
            System.out.print(num + " ");
        }

        rs.radixSort(A, n);

        System.out.println("\nSorted Array:");
        for (int num : A) 
		{
            System.out.print(num + " ");
        }
    }
}
