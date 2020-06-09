import java.util.Scanner;

public class BinarySearch {
	public static int[] input()
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;++i)
			arr[i]=s.nextInt();
		return arr;
	}
	public static int Bsearch(int a[],int find)
	{
		int start=0,end=a.length-1,mid=0;
		while(start<=end)
		{
			mid=(start+end)/2;
			if(a[mid]==find)
				return mid;
			else if(find<a[mid])
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=input();
		int x=s.nextInt();
		int ind=Bsearch(arr,x);
		if(ind!=-1)
			System.out.println("Element found at "+ind);
		else
			System.out.println("Element Not Found");
		

	}

}
