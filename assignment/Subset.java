package assignment;

public class Subset {

	public static int[][] subsets(int set[]) {
		int n=set.length;
	        int[][] arr=new int[(int)Math.pow(2,n)][];

	        for (int i = 0; i < (1<<n); i++) 
	        { int count=0;
	           
	            for (int j = 0; j < n; j++) 
	                if ((i & (1 << j)) > 0) 
	                  count++;
	            arr[i]=new int[count];
	         int k=0;
	            for (int j = 0; j < n; j++) 
	                if ((i & (1 << j)) > 0) 
	                { arr[i][k]=set[j];
	                ++k;
	                }
	  
	        }
	        return arr;
		}
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		int[][] a=subsets(arr);
		for(int i=0;i<a.length;++i)
			for(int j=0;j<a[i].length;++j)
				System.out.println(a[i][j]);
	}

}
