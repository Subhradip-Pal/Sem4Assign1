public class Q7 {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int arr_size = arr.length;
        sort012(arr);
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }

	}

	private static void sort012(int[] arr) {
		int i,j=0,c = 0,end;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==2 && j!=2) {
				j=2;
				c=i;
			}
			if(arr[i]!=2 && j==2) {
				arr[c]=arr[i];
				arr[i]=j;
				j=0;i=c;
			}
		}
		System.out.println(i+" "+c);
		end=c;
		for(i=0;i<end;i++) {
			if(arr[i]==1 && j!=1) {
				j=1;
				c=i;
			}
			if(arr[i]!=1 && j==1) {
				arr[c]=arr[i];
				arr[i]=j;
				j=0;i=c;
			}
		}
		
	}

}
