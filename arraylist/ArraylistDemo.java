package arraylist;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {

		ArrayList<Integer> l1= new ArrayList<>();
		l1.add(5);
		l1.add(20);
		l1.add(2, 78);
		System.out.println(l1.get(2));
		for(int i=0;i<l1.size();++i)
			System.out.print(l1.get(i)+" ");
		l1.remove(1); 
		l1.set(1,2);
		
		System.out.println();
		for(int ele:l1)
			System.out.print(ele+"  ");
	}

}
