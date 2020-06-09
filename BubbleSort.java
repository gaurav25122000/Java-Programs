import java.util.Scanner;

public class BubbleSort {
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
	public static void Bsort(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;++i)
		{
			for(int j=0;j<a.length-1;++j)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int arr[]=input();
		Bsort(arr);
		print(arr);
	}

}
