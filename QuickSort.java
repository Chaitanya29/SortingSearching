import java.util.*;
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		System.out.println("Enter Array elemets");
		int first=0, last=size-1;
		int arr[] = new int[size];
		for(int i=0; i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		Quick(arr, first, last);
		for(int i=0;i<size; i++)
		{
		System.out.print(arr[i]+" ");
		}
		
	}
	static void Quick(int arr[], int first, int last)
	{
		int mid;
		if(first<=last)
		{
			mid = Partition(arr, first, last);
		
			Quick(arr, first, mid-1);
			Quick(arr, mid+1, last);
			
			
			
		}
		
		
	}
	static int Partition(int arr[], int first, int last)
	
	{
		int pivote = arr[first];
		int index = first;
		for(int next_index=first+1;next_index<=last;next_index++)
		{
			if(arr[next_index]<=pivote)
			{
				index += 1;
				int temp;
				 //swap(arr, index, j);
				temp = arr[index];
				arr[index] = arr[next_index];
				arr[next_index] = temp;
				
			}
		}
		int temp2;
		temp2 = arr[first];
		arr[first] = arr[index];
		arr[index] = temp2;
	 return index;	
	}
	
}
