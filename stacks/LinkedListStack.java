package stacks;

public class LinkedListStack<T>
{
	private Node<T> head;
	private int size;
	
	public LinkedListStack()
	{
		head=null;
		size=0;
	}
	int size()
	{
		return size;
	}
	T top()
	{
		return head.data;    
	}
	
	boolean isEmpty()
	{
		return size==0;
	}
	
	void push(T data)
	{
		 if(head==null)
	        {
	            Node<T> newnode=new Node<>(data);
	            head=newnode;
	            ++size;
	            return;
	            
	        }
	        Node<T> newnode=new Node<>(data);
	        newnode.next=head;
	        head=newnode;
	        ++size;
	}
	
	T pop()
	{
		Node<T> temp=head;
        head=head.next;
        --size;
        return temp.data;
	}
}


