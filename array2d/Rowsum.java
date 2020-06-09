package array2d;

import java.util.Scanner;

public class Rowsum {
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
		int col=arr[0].length;
		for(int i=0;i<row;++i)
		{
			int sum=0;
			for(int j=0;j<col;++j)
				sum+=arr[i][j];
			System.out.print(sum+" ");
		}
	}
	public static void main(String[] args) 
	{
	
		int a[][]=input();
		rowsum(a);
	}

}
