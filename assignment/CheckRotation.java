package assignment;

import java.util.Scanner;

public class CheckRotation {

	public static int check(int arr[])
	{
		int temp=arr[0],ind=0;
		for(int i=1;i<arr.length;++i)
		{
			if(arr[i]<temp)
			{
				temp=arr[i];
				ind=i;
			}
		}
		return ind;
	}
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
	public static void main(String[] args) 
	{
		int arr[]=input();
		System.out.println(check(arr));
		print(arr);
	}

}
