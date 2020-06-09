import java.util.Scanner;

public class InsertionSort {
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
	public static void Isort(int a[])
	{
		int j=0,t=0;
		for(int i=1;i<a.length;++i)
		{
			t=a[i];
			for(j=i-1;j>=0&&t<a[j];--j)
				a[j+1]=a[j];
			a[j+1]=t;			
		}
	}
	public static void main(String[] args)
	{
		int arr[]=input();
		Isort(arr);
		print(arr);
	}

}
