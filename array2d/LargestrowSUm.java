package array2d;

import java.util.Scanner;

public class LargestrowSUm {

	public static int[][] input()
	{
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;++i)
			for(int j=0;j<col;++j)
				arr[i][j]=s.nextInt();
		return arr;
	}
	public static void rowsum(int arr[][])
	{
		int row=arr.length;
		int largest=Integer.MIN_VALUE;
		int ind=0;
		String str="";
		int col=arr[0].length;
		for(int i=0;i<row;++i)
		{
			int sum=0;
			for(int j=0;j<col;++j)
				sum+=arr[i][j];
			if(sum>largest)
			{
				ind=i;
				str="row";
				largest=sum;
			}
		}
		for(int i=0;i<col;++i)
		{
			int sum=0;
			for(int j=0;j<row;++j)
				sum+=arr[j][i];
			if(sum>largest)
			{
				ind=i;
				str="col";
				largest=sum;
			}
		}
		System.out.println(str+" "+ind+" "+largest);
}
	public static void main(String[] args) 
	{
	
		int a[][]=input();
		rowsum(a);
	}

}
