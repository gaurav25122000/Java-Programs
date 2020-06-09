package assignment;

import java.util.Scanner;

public class ZeroAtEnd {

	public static void end(int arr[])
	{
		int n=arr.length;
		int temp=0,count=0;
		 for (int i = 0; i < n; i++) 
		 { 
			    if ((arr[i] != 0)) 
			    { 
			        temp = arr[count]; 
			        arr[count] = arr[i]; 
			        arr[i] = temp; 
			        count = count + 1; 
			    } 
		  } 
	}public static int[] input()
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
		end(arr);
		print(arr);

	}

}
