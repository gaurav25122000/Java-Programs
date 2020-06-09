package assignment;

import java.util.Scanner;

public class RemoveDuplicate {

	public static String remove(String str)
	{
		str+="1";
		String temp="";
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length()-1;++i)
		{
			if(ch[i]==ch[i+1])
				continue;
			else
				temp+=ch[i];
		}
		return temp;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=remove(str1);
		System.out.println(str2);
	}

}
