package functions;

import java.util.Scanner;

public class Prime2ToN {
	public static boolean isprime(int n)
	{
		int d=2;
		while(d<n)
		{
			if(n%d==0)
				return false;
			d++;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<=n;++i)
			if(isprime(i)==true)
				System.out.print(i+" ");

	}

}
