import java.util.Scanner;

public class SumOddEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int s_e=0;
		int s_o=0;
		int div=0;
		while(n>0)
		{
			div=n%10;
			if(div%2==0)
				s_e+=div;
			else
				s_o+=div;
			n=n/10;
		}
		System.out.println(s_e+" "+s_o);
		
	}

}
