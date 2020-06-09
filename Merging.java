import java.util.Scanner;

public class Merging {
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
	public static int[] merge(int a[],int b[])
	{
		int merged[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length)
		{
			if(a[i]<b[j])
			{
				merged[k]=a[i];
				++i;
			}
			else if(a[i]>b[j])
			{
				merged[k]=b[j];
				++j;
			}
			else
			{
				merged[k]=a[i];
				merged[++k]=b[j];
				++i;
				++j;
			}
			++k;
		}
		while(i<a.length)
		{
			merged[k]=a[i];
			++i;
			++k;
		}
		while(j<b.length)
		{
			merged[k]=b[j];
			++j;
			++k;
		}
		return merged;
	}
	public static void main(String[] args) 
	{
		int arr1[]=input();
		int arr2[]=input();
		int merged[]=merge(arr1,arr2);
		print(merged);
	}

}
