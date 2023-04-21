
public class Sorting {
	
	//Bubble Sort
	public static void bubble_Sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	//Insertion Sort
	public static void insertion_Sort(int arr[]) {
		int j;
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			for(j=i-1;j>=0 && arr[j]>temp;j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
	}
	
	//Selection Sort
	public static void selection_Sort(int arr[]) {
		int i,j,min;
		for(i=0;i<arr.length-1;i++) {
			min=i;
			for(j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j])
					min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
	}
	
	//Merge Sort
	public static void merge_Sort(int arr[]) {
		
	}
	

	public static void main(String[] args) {
		//int arr[]= { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		int arr[]= {0,1,2,3,2,4,5,6,7,8,9,0,9,88,76,35,16,45};
		selection_Sort(arr);
		System.out.print("Sorted list: ");
		for(int e:arr) 
			System.out.print(e+" ");

	}

}
