package assignment;

import java.util.Scanner;

public class SecondLargest 
{
	public static void large(int arr[])
	{
		 int i, first, second; 
		 int arr_size=arr.length;
	        if (arr_size < 2) 
	        { 
	            System.out.println(Math.pow(-2, 31)); 
	            return; 
	        } 
	        first = second = Integer.MIN_VALUE; 
	        for (i = 0; i < arr_size ; i++) 
	        { 
	            if (arr[i] > first) 
	            { 
	                second = first; 
	                first = arr[i]; 
	            } 
	            else if (arr[i] > second && arr[i] != first) 
	                second = arr[i]; 
	        } 
	          
	        if (second == Integer.MIN_VALUE) 
	             System.out.println(Math.pow(-2, 31)); 
	        else
	             System.out.println(second); 
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
		large(arr);
		print(arr);
	}
}
