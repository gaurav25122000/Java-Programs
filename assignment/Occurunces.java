package assignment;

import java.util.Scanner;

public class Occurunces {

	public static char occur(String str)
	{
		 int count[] = new int[256]; 
	        int len = str.length(); 
	        for (int i=0; i<len; i++) 
	            count[str.charAt(i)]++; 
	        int max = -1;  
	        char result = ' '; 
	        for (int i = 0; i < len; i++) { 
	            if (max < count[str.charAt(i)]) { 
	                max = count[str.charAt(i)]; 
	                result = str.charAt(i); 
	            } 
	        } 
	        return result; 
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(occur(str));
	}

}
