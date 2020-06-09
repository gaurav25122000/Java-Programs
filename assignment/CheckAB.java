package assignment;

import java.util.Scanner;

public class CheckAB {

	public static boolean check(String s) {
		
		 if (s.length()==0) 
		        return true;
		    if (s.charAt(0) != 'a')
		        return false;
		    if (s.length() >= 3 && "abb".equals(s.substring(0,3)))
		        return check(s.substring(3));
		    else
		        return check(s.substring(1));

			}
	public static void main(String[] args) {
		
//			Scanner s = new Scanner(System.in);
//			String input = s.next();
//			System.out.println(check(input));
		int[][] arr=new int[2][];
		arr[0]=new int[5];
		for(int i=0;i<1;++i)
			for(int j=0;j<5;++j)
			System.out.print(arr[i][j]);
	}

}
