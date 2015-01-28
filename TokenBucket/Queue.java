package TokenBucket;

public class Queue<T> 
{
	LinkedListHelper<T> list = new LinkedListHelper<T>();
	packet p=new packet();
    private int size=100;
    private int count=0;
    
    IteratorCustomized data_iterate=list.iterator();
    
	void enqueue(T data)
	{
		if(list.getSize()>size)
			System.out.println("Queue is full.");
		else
		  list.AddAtEnd(data);
		count++;
	}
	T dequeue()
	{			

		if(list.IsEmpty())
			System.out.println("Queue is empty.");	
		list.DelFirst();
		count--;
		  return (T) list.getElement();		
	}	
	T dequeue(T data)
	{			

		if(list.IsEmpty())
			System.out.println("Queue is empty.");	
		list.DelFirst();
		  return (T) data_iterate.getdata();
	}	
	int numOfElements()
	{
		return list.getSize();
	}
	void display()
	{
		System.out.println(p.getId());
	}
	
}

