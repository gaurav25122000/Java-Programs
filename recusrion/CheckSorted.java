package recusrion;

public class CheckSorted {

	public static boolean check(int input[],int start)
	{
		if(input.length-1<=start)
			return true;
		if(input[start]>input[start+1])
			return false;
		return check(input,start+1);
		
	}
	public static void main(String[] args) 
	{
		int inp[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(check(inp,0));
	}

}
