package recusrion;

import java.util.Scanner;

public class Power {

	public static int pow(int x,int n)
	{
		if(n==0)
			return 1;
		return x*pow(x,n-1);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		System.out.println(pow(x,n));

	}

}
