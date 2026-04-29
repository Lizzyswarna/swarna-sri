class MergeSort 
{
    void merge(int A[], int lb, int mid, int ub) 
	{
        int i = lb;
        int j = mid + 1;
        int k = lb;

        int B[] = new int[A.length];

        while (i <= mid && j <= ub) 
		{
            if (A[i] <= A[j]) 
			{
                B[k] = A[i];
                i++;
            } 
			else 
			{
                B[k] = A[j];
                j++;
            }
            k++;
        }

        while (i <= mid) 
		{
            B[k] = A[i];
            i++;
            k++;
        }

        while (j <= ub) 
		{
            B[k] = A[j];
            j++;
            k++;
        }

        for (int m = lb; m <= ub; m++) 
		{
            A[m] = B[m];
        }
    }

    void mergeSort(int A[], int lb, int ub) 
	{
        if (lb < ub) 
		{
            int mid = (lb + ub) / 2;

            mergeSort(A, lb, mid);     
            mergeSort(A, mid + 1, ub); 
            merge(A, lb, mid, ub);
        }
    }

    public static void main(String args[]) 
	{
        int A[] = {38, 27, 43, 3, 9, 82, 10};
        MergeSort ms = new MergeSort();

        System.out.println("Original Array:");
        for (int num : A) 
		{
            System.out.print(num + " ");
        }

        ms.mergeSort(A, 0, A.length - 1);

        System.out.println("\nSorted Array:");
        for (int num : A) 
		{
            System.out.print(num + " ");
        }
    }
}
