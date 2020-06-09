package recusrion;

import java.util.Scanner;

public class Factorial {

	public static int fact(int n)
	{
		if(n==0)
			return n;
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Factorial is : "+fact(n));

	}

}
