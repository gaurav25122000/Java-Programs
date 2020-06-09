package linkedlist;

import java.util.Scanner;

public class Use {

//	Printing the linked list
	public static void print(Node<Integer> head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	
//	Taking input in the list	
	public static Node<Integer> input()
	{
		Node<Integer> head=null,tail=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data!=-1)
		{
			
			Node<Integer> n=new Node<>(data);
			n.next=null;
			if(head==null)
				head=tail=n;
			else
			{
				tail.next=n;
				tail=tail.next;
			}
			data=s.nextInt();
		}
		return head;
	}
	
	
//	Inserting element at a particular position
	public static Node<Integer> insert(Node<Integer> head,int data,int pos)
	{
		Node<Integer> temp=head;
		Node<Integer> newnode=new Node<Integer>(data);
		if(pos==0)
		{
			newnode.next=temp;
			return newnode;
		}
		int count=0;
		while(count<pos-1)
		{
			++count;
			temp=temp.next;
		}
		
		newnode.next=temp.next;
		temp.next=newnode;
		
		return head;
	}
	
	
//	Recursive Insertion	
	public static Node<Integer> Recursive_insert(Node<Integer> head,int data,int pos)
	{
		if(pos==0)
		{
			Node<Integer> newnode=new Node<>(data);
			newnode.next=head;
			return newnode;
		}
		if(head==null)
		{
			System.out.println("Not a valid position");
			return head;
		}
		head.next =Recursive_insert(head.next,data,pos-1);
		return head;
	}
	public static Node<Integer> removeDuplicates(Node<Integer> head) {
        Node<Integer> temp=head;  
       if(head.next==null)
           return head;
     while(temp.next!=null)
     {
         if(temp.data.equals(temp.next.data))
         {
             temp.next=temp.next.next;
         }
         else
         	temp=temp.next;
     }
     return head; 
   }

	
//	Deleting element from a position
	public static Node<Integer> delete(Node<Integer> head,int pos)
	{
		Node<Integer> temp=head;
		int count=0;
		if(pos==0)
		{
			head=head.next;
			return head;
		}
		while(count<pos-1)
		{
			++count;
			temp=temp.next;
		}
		if(temp.next.next==null)
			temp.next=null;
		else
			temp.next=(temp.next).next;
		return head;
	}
	
	
//	Deleting element Recursively
	public static Node<Integer> R_delete(Node<Integer> head,int pos)
	{
		if(pos==0)
		{
			Node<Integer> temp=head;
			head=head.next;
			temp.next=null;
			return head;
		}
		head.next = R_delete(head.next,pos-1);
		return head;
	}
	
	
//Finding the middle element of a list
	public static Node<Integer> mid(Node<Integer> head)
	{
		Node<Integer> slow,fast;
		slow=fast=head;
		while((fast.next)!=null&&fast.next.next!=null)
		{
			
			{fast=fast.next.next;
			slow=slow.next;}
		}
		return slow;
	}
	
	
//	Iterative Approach
	public static Node<Integer> merge(Node<Integer> head1, Node<Integer>head2)
	{
		Node<Integer> t1=head1,t2=head2,fhead,temp;
		if(head1.data.compareTo(head2.data)<0)
		{
			fhead=head1;
			t1=t1.next;
		}
		else
		{
			fhead=head2;
			t2=t2.next;
		}
		temp=fhead;
		while(t1!=null&&t2!=null)
		{
			if(t1.data.compareTo(t2.data)<0)
			{
				temp.next=t1;
				t1=t1.next;
			}
			else
			{
				temp.next=t2;
				t2=t2.next;
			}
			temp=temp.next;
		}
		while(t1!=null)
		{
			temp.next=t1;
			t1=t1.next;
			temp=temp.next;
		}
		while(t2!=null)
		{
			temp.next=t2;
			t2=t2.next;
			temp=temp.next;
			
		}
		return fhead;
	}
	
	
//	Recursive Approach for merge sort
	 public static Node<Integer> sortedMerge(Node<Integer> a, Node<Integer> b) 
	 { 
	        Node<Integer> result = null; 
	        if (a == null) 
	            return b; 
	        if (b == null) 
	            return a; 
	  
	        if (a.data <= b.data) { 
	            result = a; 
	            result.next = sortedMerge(a.next, b); 
	        } 
	        else { 
	            result = b; 
	            result.next = sortedMerge(a, b.next); 
	        } 
	        return result; 
	 } 
	  
	 
	 public static Node<Integer> mergeSort(Node<Integer> h) 
	 { 
	        if (h == null || h.next == null) { 
	            return h; 
	        } 
	  
	        Node<Integer> middle = mid(h); 
	        Node<Integer> nextofmiddle = middle.next; 
	  
	        middle.next = null; 
	  
	        Node<Integer> left = mergeSort(h); 
	  
	        Node<Integer> right = mergeSort(nextofmiddle); 
	  
	        Node<Integer> sortedlist = sortedMerge(left, right); 
	        return sortedlist; 
	} 
	 
	 
//	Reversing a list
	public static Node<Integer> reverse(Node<Integer> node) 
	{ 
		Node<Integer> prev = null; 
		Node<Integer> current = node; 
		Node<Integer> next = null; 
		while (current != null)
		{ 
			next = current.next; 
			current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
	} 
	
	
//	Recursively Reversing a list
	public static Node<Integer> Recursive_reverse(Node<Integer> head)
	{
		if(head==null|| head.next==null)
			return head;
		Node<Integer> tail=head.next;
		Node<Integer> finalhead=Recursive_reverse(head.next);
		tail.next=head;
		head.next=null;
		return finalhead;
	}
	
	
	
	
	public static void main(String[] args) {

		

		Node<Integer> head1=input();
//		Node<Integer> head2=input();
//		print(head1);
//		print(head2);
//		head1=insert(head,20,0);
//		print(head1);
//		head=delete(head1,2);
//		head=removeDuplicates(head1);
//		print(head1);
//		Node<Integer> middle=mid(head1);
//		System.out.println(middle.data);
//		Node<Integer> newhead=merge(head1,head2);
//		print(newhead);
//		Node<Integer> sorted=mergeSort(head1);
//		print(sorted);
//		Node<Integer> rev=reverse(head1);
//		print(rev);
//		Node<Integer> rev=Recursive_reverse(head1);
//		print(rev);
//		head1=Recursive_insert(head1,20,2);
//		print(head1);
//		head1=R_delete(head1,1);
//		print(head1);

	}

}
