import java.util.Scanner;

public class CountWords {

	public static int countWords(String str)
	{
		int word=1;
		if(str.length()==0)
			word=0;
		for(int i=0;i<str.length();++i)
		{
			if(str.charAt(i)==' ')
				word++;
		}
		return word;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(countWords(str));
		
	}

}
