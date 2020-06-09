package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Intersection {
	static Scanner S = new Scanner(System.in);

	public static int[] takeInput() {	
		int size = S.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = S.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();

		intersections(arr1, arr2);
	}
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
	public static void intersections(int[] input1, int[] input2)
    {
		 int arr1[]=input1;
	        int arr2[]=input2;
		 int result =Integer.MIN_VALUE;
	    int i =0 ;
	    int j =0;
	    sort(arr1);
	    sort(arr2);
	    while(i< arr1.length && j<arr2.length){
	    if (arr1[i]>arr2[j]){
	        j++;

	    }else if (arr1[i]<arr2[j]){
	        i++;

	    }else {
	        result=arr1[i];
	          System.out.println(result);
	        i++;
	        j++;
	    }
	    }
    }}
