package recusrion;

public class RemoveX {

	public static String remove(String str)
	{
		if(str.length()==0)
			return str;
		String ans="";
		if(str.charAt(0)!='x')
			ans+=str.charAt(0);
		
		return ans+remove(str.substring(1));
	}
	public static void main(String[] args)
	{
		System.out.println(remove("xaaabxxxaxxavx"));
	}

}
