package array;

import java.util.Scanner;

public class LargetstInArray {

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
	public static int Largest(int arr[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;++i)
			if(arr[i]>max)
				max=arr[i];
		return max;
	}

	public static int findUnique(int[] arr)
    {
		int unique=arr[0];
        for(int i=1;i<arr.length;++i)
        {
			unique=unique^arr[i];
			System.out.print(unique+" ");
        }
        return unique;
		
	}
	public static void main(String[] args) 
	{
		int a[]=input();
		print(a);
		findUnique(a);
		print(a);
		System.out.println(Largest(a));
		
	}

}
