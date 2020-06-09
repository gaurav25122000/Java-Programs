package functions;

import java.util.Scanner;

public class NcR {
	
	public static int fact(int n)
	{
		int res=1;
		for(int i=1;i<=n;++i)
			res*=i;
		return res;
	}

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
	public static void TillN(int n)
	{
		for(int i=1;i<=n;++i)
			System.out.print(i+" ");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r = s.nextInt();
		int ans=fact(n)/(fact(r)*fact(n-r));
		System.out.println(ans);
		int prime=s.nextInt();
		System.out.println(isprime(prime));
		int N=s.nextInt();
		TillN(N);
		
		
	}

}
