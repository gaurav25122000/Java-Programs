import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String str=scan.nextLine();
		int m1=scan.nextInt();
		int m2=scan.nextInt();
		int m3=scan.nextInt();
		int avg=(m1+m2+m3)/3;
		System.out.println(str);
		System.out.println(avg);
	}

}
