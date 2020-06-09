package array2d;

import java.util.Scanner;

public class Spiral {
	
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
	public static void print(int a[][])
	{
		int i=0, k = 0, l = 0,m=a.length,n=a[0].length; 
  
        while (k < m && l < n) { 
            for (i = l; i < n; ++i) { 
                System.out.print(a[k][i] + " "); 
            } 
            k++; 
              for (i = k; i < m; ++i) { 
                System.out.print(a[i][n - 1] + " "); 
            } 
            n--; 
              if (k < m) { 
                for (i = n - 1; i >= l; --i) { 
                    System.out.print(a[m - 1][i] + " "); 
                } 
                m--; 
            } 
              if (l < n) { 
                for (i = m - 1; i >= k; --i) { 
                    System.out.print(a[i][l] + " "); 
                } 
                l++; 
            } 
        } 
	}
	public static void main(String[] args) 
	{
	
		int a[][]=input();
		print(a);
	}

}
