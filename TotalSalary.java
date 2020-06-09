import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int basic=s.nextInt();
		String str=s.next();
		char ch=str.charAt(0);
		float hra=20.0f*basic/100f;
		float da=50.0f*basic/100f;
		float pf=11.0f*basic/100f;
		float allow=0f;
		if(ch=='A')
			allow=1700f;
		else if(ch=='B')
			allow=1500f;
		else
			allow=1300f;
		float totalSalary=basic+hra+da+allow-pf;
		System.out.println(Math.round(totalSalary));

		
	}

}
