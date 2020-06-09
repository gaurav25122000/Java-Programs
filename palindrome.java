import java.util.Scanner;

public class palindrome {
	public static boolean check(String str)
	{
		String temp="";
		for(int i=str.length()-1;i>=0;--i)
			temp+=str.charAt(i);
		if(str.compareToIgnoreCase(temp)==0)
			return true;
		else
			return false;
			
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(check(str));
	}

}
