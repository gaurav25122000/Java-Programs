package array2d;

import java.util.Scanner;

public class WavePrint {


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
	public static void wave(int arr[][])
	{
		int row=arr.length;
		int col=arr[0].length;
		for(int i=0;i<col;++i)
		{
			if(i%2==0)
			{
				for(int j=0;j<row;++j)
				{
					System.out.print(arr[j][i]+" ");
				}
			}
			else
				for(int j=row-1;j>=0;--j)
				{
					System.out.print(arr[j][i]+" ");
				}
			
		}
	}
	public static void main(String[] args) 
	{
	
		int a[][]=input();
		wave(a);
	}
}
