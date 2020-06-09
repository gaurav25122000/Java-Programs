
public class DynamicArray 
{
	private int data[],ind;
	
	public DynamicArray()
	{
		data=new int[5];
		ind=0;
	}
	
	public int size()
	{
		return ind;
	}
	
	public void add(int ele)
	{
		if(ind==data.length)
		  restructure();
		data[ind]=ele;
		ind++;
	}
	
	public void set(int index,int ele)
	{
		while(index>data.length)
			restructure();
			data[index]=ele;
	}
	
	public int get(int index)
	{
		if(index>=ind)
			return -1;
		return data[index];
	}
	public boolean isEmpty()
	{
		if(size()==0)
			return true;
		return false;
	}
	
	public int removeLast()
	{
		if(size()==0)
			return -1;
		int value=data[ind-1];
		data[ind-1]=0;
		ind--;
		return value;
	}
	
	private void restructure()
	{
		int temp[]=data;
		data=new int[data.length*2];
		for(int i=0;i<temp.length;++i)
			data[i]=temp[i];
	}
}
