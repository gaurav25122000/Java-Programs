package recusrion;

public class Replace {

	public static String remove(String str,char c1,char c2)
	{
		if(str.length()==0)
			return str;
		String ans="";
		if(str.charAt(0)==c1 )
			ans+=c2;
		else
			ans+=str.charAt(0);
		
		return ans+remove(str.substring(1),c1,c2);
	}
	public static void main(String[] args)
	{
		System.out.println(remove("xvx",'x','a'));
	}

}
