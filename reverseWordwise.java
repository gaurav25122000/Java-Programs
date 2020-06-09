import java.util.Scanner;

public class reverseWordwise {

	public static void rev(String str)
	{
		String[] words=str.split("\\s");
		String revstr="";
		for(int i=words.length-1;i>=0;--i)
		{
			revstr+=words[i]+" ";
		}
		System.out.println(revstr);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		rev(str);
	}

}
