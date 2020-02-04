
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2, 1, 21, 13, 45, 34};
		int min, j, temp;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			min = i;
			for(j=i+1; j<arr.length-1; j++)
			{
				if(arr[min]>arr[j])
				{
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
		for(int i=0;i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	

}
