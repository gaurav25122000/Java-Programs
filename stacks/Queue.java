package stacks;

public class Queue<T> {
    private Node<T> front;
	private Node<T> rear;
    private int size;
	public Queue() {
        front =null;
        rear=null;
        size=0;

	}

	public void enqueue(T data) {
        if(rear==null)
        {
            Node<T> newnode=new Node<>(data);
	    	front=newnode;
            rear=newnode;
            ++size;
	        return;  
        }
		Node<T> newnode=new Node<>(data);
        rear.next=newnode;
        rear=newnode;
        ++size;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
        return size==0;

	}

	public T dequeue() throws QueueEmptyException {
        if(size==0)
        {
            QueueEmptyException e=new QueueEmptyException();
            throw e;
        }
        Node<T> temp=front;
        front=front.next;
        --size;
        return temp.data;

	}

	public T front() throws QueueEmptyException {
        if(size==0)
        {
            QueueEmptyException e=new QueueEmptyException();
            throw e;
        }
		return front.data;
	}
}
