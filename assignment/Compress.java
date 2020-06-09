package assignment;

import java.util.Scanner;

public class Compress {

	public static String rle(String str)
	{
		String temp="";
        int n = str.length(); 
        for (int i = 0; i < n; i++) 
        { 
            int count = 1; 
            while (i < n - 1 &&str.charAt(i) == str.charAt(i + 1))
            { 
                count++; 
                i++; 
            } 
            temp+=str.charAt(i); 
            temp+=count; 
        } 
        return temp;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(rle(str));
	}

}
