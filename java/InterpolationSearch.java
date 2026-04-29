public class InterpolationSearch 
{
    public static int interpolationSearch(int[] arr, int x) 
	{
        int low = 0, high = arr.length - 1;

        while (low <= high && x >= arr[low] && x <= arr[high]) 
		{
            if (low == high) 
			{
                if (arr[low] == x) return low;
                return -1;
            }

            int pos = low + ((x - arr[low]) * (high - low)) 
                      / (arr[high] - arr[low]);

            if (arr[pos] == x)
                return pos;
            if (arr[pos] < x)
                low = pos + 1;
            else
                high = pos - 1;
        }
        return -1;
    }

    public static void main(String[] args) 
	{
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int key = 50;

        int index = interpolationSearch(arr, key);
        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
    }
}
