package recusrion;

public class Subsequesnces {

	public static String[] print(String str)
	{
		if(str.length()==0)
		{
			String ans[]= {""};
			return ans;
		}
		String Ans[]=print(str.substring(1));
		String Final[]=new String[2*Ans.length];
		for(int i=0;i<Ans.length;++i)
			Final[i]=Ans[i];
		for(int i=0;i<Ans.length;++i)
			Final[Ans.length+i]=str.charAt(0)+Ans[i];
		return Final;
	}
	public static void main(String[] args) {
		String ans[]=print("xyz");
		for(int i=0;i<ans.length;++i)
			System.out.println(ans[i]);
		}

}
