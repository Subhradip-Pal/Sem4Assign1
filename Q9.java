
public class Q9 {
	
	static int equilibrium(int arr[], int n)
    {
        int i, j;
        int leftsum, rightsum;
        for (i = 0; i < n; ++i) {
            leftsum = 0;
            for (j = 0; j < i; j++)
                leftsum += arr[j];
            rightsum = 0;
            for (j = i + 1; j < n; j++)
                rightsum += arr[j];
            if (leftsum == rightsum)
                return i;
        }
        return -1;
    }

	public static void main(String[] args) {
        int arr[] = {10,2,12,4,6,2};
        int arr_size = arr.length;
        System.out.println(equilibrium(arr, arr_size));

	}

}
