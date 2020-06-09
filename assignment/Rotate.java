package assignment;

import java.util.Scanner;

public class Rotate 
{
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
	public static void rotate(int arr[],int d)
	{
		for(int i=0;i<d;++i)
		{
			int temp=arr[0];
			for(int j=0;j<arr.length-1;++j)
				arr[j]=arr[j+1];
			arr[arr.length-1]=temp;
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int arr[]=input();
		int d=s.nextInt();
		rotate(arr,d);
		print(arr);

	}


}
