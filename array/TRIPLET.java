package array;

public class TRIPLET {
	public static void sort(int arr[])
	{
		int temp=0; 
		for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	          
	}
	public static void find3Numbers(int A[], int arr_size, int sum) 
	    { 
	    
	        int chota[]=new int[3];
		  
		        for (int i = 0; i < arr_size - 2; i++) { 
		  
		            for (int j = i + 1; j < arr_size - 1; j++) {  
		                for (int k = j + 1; k < arr_size; k++) { 
		                    if (A[i] + A[j] + A[k] == sum) { 
	                            chota[0]=A[i];
	                            chota[1]=A[j];
	                            chota[2]=A[k];
	                            sort(chota);
		                        System.out.println(chota[0] + " " + chota[1] + " " + chota[2]); 
		                       
		                    } 
		                } 
		            } 
		        } 
	        
	   } 
	  

	    public static void main(String[] args) 
	    {  
	        int A[] = { 0, 45, 9,6,4, 2, 10,1, 8 }; 
	        int sum = 10; 
	        int arr_size = A.length; 
	  
	        find3Numbers(A, arr_size, sum); 
	    } 
}