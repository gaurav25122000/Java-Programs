import java.util.Scanner;

public class SelectionSort {
	public static int[] input()
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;++i)
			arr[i]=s.nextInt();
		return arr;
	}
	public static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void Ssort(int a[])
	{
		int min=0,ind=0,temp=0;
		for(int i=0;i<a.length-1;++i)
		{
			min=a[i];
			ind=i;
			for(int j=i+1;j<a.length;++j)
			{
				if(a[j]<min)
				{
					min=a[j];
					ind=j;
				}
			}
			temp=a[i];
			a[i]=a[ind];
			a[ind]=temp;
		}
	}
	public static void main(String[] args) 
	{
		int arr[]=input();
		Ssort(arr);
		print(arr);		
	}

}
