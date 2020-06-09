package assignment;

import java.util.Scanner;

public class ReverseEveryWord {

	public static String rev(String str)
	{
		String[] words=str.split(" ");
		String revstr="";
		for(int i=0;i<words.length;++i)
		{
			for(int j=words[i].length()-1;j>=0;--j) 
			{
				char[] ch=words[i].toCharArray();
				revstr+=ch[j];
			}
			if(i!=words.length-1)
				revstr+=" "	;
		}
		return revstr;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(rev(str));
	}
}
