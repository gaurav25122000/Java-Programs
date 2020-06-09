package recusrion;

public class ArraySum {

	public static int sum(int arr[])
	{
		if(arr.length==0)
			return 0;
		if(arr.length==1)
			return arr[0];
		int[] newarr=new int[arr.length-1];
		for(int i=1;i<arr.length;++i)
			newarr[i-1]=arr[i];
		return arr[0]+sum(newarr);
	}
	public static void main(String[] args) {
		int inp[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(sum(inp));
	}

}
