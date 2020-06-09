package If_Else;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n%2==0)
			System.out.print("EVEN");
		else
			System.out.print("ODD");
	}

}
