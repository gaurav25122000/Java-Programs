package assignment;

import java.util.Scanner;

public class removechar {

	public static String replace(String str,char ch)
	{
		String temp="";
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();++i)
		{
			if(arr[i]==ch)
				continue;
			else
				temp+=arr[i];
		}
		return temp;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String temp=s.next();
		char ch= temp.charAt(0);
		System.out.println(replace(str,ch));
	}
}
