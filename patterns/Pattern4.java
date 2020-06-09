package patterns;

import java.util.Scanner;

public class Pattern4 {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int i=1;
			while(i<=(n/2)+1)
			{
				int spaces =1;
				while(spaces<=(n/2)+1-i)
				{
					System.out.print(" ");
					spaces++;
				}
				int j=1;
				while(j<=i)
				{
					System.out.print("*");
					j++;
				}
				j=1;
				while(j<=i-1)
				{
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
			}
			n=n/2;
			i=1;
			while(i<=n)
			{
				int space=1;
				while(space<=i)
				{
					System.out.print(" ");
					space++;
				}
				int j=1;
				while(j<=2*(n-i)+1)
				{
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
			}
			}
		
	


}
