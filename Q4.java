import java.util.Arrays;

public class Q4 {
	
	static void zigZag(int[] arr)
    {
        Arrays.sort(arr);
        for (int i = 1; i <= arr.length - 2; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

	public static void main(String[] args) {
		int arr[] = new int[] { 4, 3, 7, 8, 6, 2, 1 };
		zigZag(arr);
		System.out.println(Arrays.toString(arr));

	}

}
