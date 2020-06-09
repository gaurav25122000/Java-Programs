package assignment;

import java.util.Scanner;

public class SumOf2Array {
	public static int[] sum(int arr1[],int arr2[])
	{
		int carry = 0;
		int sum = 0;
		int len = Math.max(arr1.length,arr2.length);
		int[] arr11 = new int[len];
		int[] arr22 = new int[len];
		int arr3[] = new int[len+1];
		for(int i=len-1;i>=-1;i--) {
		    if(i==-1) {
		        arr3[i+1] = carry;
		    } else {
		        if (i>=len-arr1.length)
		            arr11[i]=arr1[i-(len-arr1.length)];
		        if (i>=len-arr2.length)
		            arr22[i]=arr2[i-(len-arr2.length)];
		        sum = arr11[i] + arr22[i] + carry;
		        if(sum>9) {
		            arr3[i+1] = sum % 10;
		            carry = 1;
		        } else {
		            arr3[i+1] = sum;
		            carry = 0;
		        }
		    }
		}
		return arr3;
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
		int arr1[]=input();
		int arr2[]=input();
		int sumed[]=sum(arr1,arr2);
		print(sumed);
	}
}
