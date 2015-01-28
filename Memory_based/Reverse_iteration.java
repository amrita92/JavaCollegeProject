package Memory_based;

public class Reverse_iteration<T>
{    
    public  void reverse(LinkedListHelper<T> list)
	{
		
		LinkedListHelper<T>.Node start=null;
		LinkedListHelper<T>.Node next=null;
		LinkedListHelper<T>.Node prev=null;
		
	    start=list.getHead();
		
	    //Check if list is empty.
		if(list.IsEmpty())
		{
			System.out.println("list is empty.");
		}
		
		//Changing the forward link so that it points to previous.
		while(start!=null)
		{		
			next=start.getNext();
			start.getNext();
			start.setLink(prev);
			prev=start;
			start=next;		
		}
		list.setHead(prev);
}
  
}
	
