package stacks;

public class ArrayStack {

	private int data[];
	private int top;
	
	public ArrayStack()
	{
		data = new int[10];
		top=-1;
	}
	
	public ArrayStack(int size)
	{
		data = new int[size];
		top=-1;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public int size()
	{
		return top+1;
	}
	
	public int top() throws StackEmptyException
	{
		if(top==-1)
		{
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	public void push(int x)
	{
		if(size()==data.length)
		{
//			StackFullException f=new StackFullException();
//			throw f;
			doublecapacity();
		}
		data[++top]=x;
	}
	private void doublecapacity()
	{
		int temp[]=data;
		data=new int[2*data.length];
		for(int i=0;i<temp.length;++i)
			data[i]=temp[i];
	}
	public void pop() throws StackEmptyException
	{
		if(top==-1)
		{
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		System.out.println(data[top]);
		--top;
	}

}
