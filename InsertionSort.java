
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {92, 1, 21, 13, 45, 34};
		
		int value, j;
		for(int i=1; i<arr.length; i++)
		{
			value= arr[i];
			j = i;
			while(j>=1 && arr[j-1]>arr[j])
			{
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = value;
		}
		
		for(int i=0;i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
