import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p=scan.nextInt(),r=scan.nextInt(),t=scan.nextInt();
		int si=(p*r*t)/100;
		System.out.println(si);
	}

}
