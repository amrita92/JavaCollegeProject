package TokenBucket;
public class Queue<T> 
{
	LinkedListHelper<T> list = new LinkedListHelper<T>();
    
    IteratorCustomized data_iterate;
    
	void enqueue(T data)
	{
		  list.AddAtEnd(data);	
	}
	
	T dequeue()
	{				
		data_iterate=list.iterator();
		if(list.IsEmpty())
		{
			System.out.println("Queue is empty");
			return null;
		}
		else
		{
		T temp=(T) data_iterate.getdata();
		list.DelFirst();
		return temp;
		}
		
	}	
	
	int numOfElements()
	{
		return list.getSize();
	}
	
}
	


