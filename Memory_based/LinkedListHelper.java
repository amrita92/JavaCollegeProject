package Memory_based;

/**
 * @author Amrita 
 * 
 * @param <T>
 */
public class LinkedListHelper<T> 
{

	private Node head;
	private Node end;
	private Node Ref;
	private int size;
	
	
    //Create an inner class Node which is a linked list Node.
	public class Node {

		private T data;
		private Node link;
        
		//Adding getters and setters.
		public T getData() 
		{
			return data;
		}

		public void setData(T data) 
		{
			this.data = data;
		}

		public Node getNext() 
		{
			return link;
		}

		public void setLink(Node link)
		{
			this.link = link;
		}

		public Node(T data) 
		{
			this.data = data;
		}

		public Node() 
		{
			this.link = null;
		}

	}
   
	//Constructor for initiasing.
	public LinkedListHelper()
	{

		head = null;
		Ref = head;
		end = null;
		size = 0;
	}

	//Adding getters and setters.
	public Node getHead()
	{
		return head;
	}
  
	public void setHead(Node head) 
	{
		this.head = head;
	}

	public int getSize()
	{
		return size;
	}

	private void setSize() 
	{
		this.size++;
	}

	//Adding a node at the beginning.If list is empty set node as head else new node is head pointing to next node.
	public void addAtStart(T data) 
	{
		Node temp = new Node(data);
		size++;
		if (head == null)    
		{
			setHead(temp);
			end = temp;

		} 
		else 
		{
			temp.setLink(head);
			setHead(temp);
		}
	}
	
	
	//Getting node at a specific position.Traverse till the position and return node.
	public Node GetNodeAt(int pos) 
	{
		Node ref = getHead();
		int count = 1;
		while (count != pos) 
		{
			ref = ref.getNext();
			count++;
		}
		return ref;
	}
	
	
    //Display the linked list.Traverse till end of list and print the data.
	public void Display() 
	{
		Node ref = null;
		ref = getHead();

		while (ref != null)
		{
			System.out.print(ref.getData()+"->");
			ref = ref.getNext();
		}
		
	  System.out.println("NULL");
	}
	
	
   //Check if list is empty or not.
	public Boolean IsEmpty() 
	{
		if (this.head == null) 
		{
			return true;
		}
		return false;
	}
	

	//Adding a node at the end of linked list.If empty then add in beginning else add after end node.
	public void AddAtEnd(T data) 
	{
		if (IsEmpty()) 
		{
			addAtStart(data);
		}

		else 
		{
			Node temp = new Node(data);
			setSize();
			end.setLink(temp);
			end = temp;
		}
	}
	
	//Adding a node at a specific position in  linked list.
	public void AddNodeAt(int pos, T data) 
	{
		if (pos == 1)
		{
			addAtStart(data);  //If only one node add in the beginning.
		}

		else if (pos == size) //If it points to last element then add at last.
		{
			AddAtEnd(data);
		}

		else                 //Traverse till the node and let prev link point to new node and new node link point to next node.
		{
			Node temp = new Node(data);
			setSize();
			Node ref = GetNodeAt(pos - 1);
			temp.setLink(ref.getNext());
			ref.setLink(temp);
		}
	}
	

	// deletes the first element of the list.Point head to next node.
	public void DelFirst() 
	{
		if (IsEmpty())
			System.out.println("list is empty");
		else if (getSize()==1)
		{
		  DelAll();	
		}
		else
			setHead(head.getNext());

	}

	
	// deletes the last element
	public void DelLast() 
	{
		if (IsEmpty())
			System.out.println("list is empty");
		else if (getSize()==1)
		{
		  DelAll();	
		}
		else 
		{
			Node ref = GetNodeAt(size - 1);
			ref.setLink(null);
			end = ref;
		}
	}

	
	// deletes the element at given position.Traverse till the position let prev node point to next of next node.
	public void DelAtPos(int pos) 
	{

		if (IsEmpty())
			System.out.println("list is empty");
		else 
		{
			Node ref = GetNodeAt(pos - 1);
			ref.setLink(ref.getNext().getNext());
		}
	}

	
	// deletes all the items in the list
	public void DelAll()
	{
		if (IsEmpty())
			System.out.println("list is empty");
		else 
		{
			head = null;
			end = null;
		}
	}


	// implementing methods of iterator.
	private class LinkListHelperIterator<T> implements IteratorCustomized<T> 
	{

		private Node Ref1;

		public LinkListHelperIterator() 
		{
			Ref1 = getHead();
		}

		@Override
		public boolean hasNext() 
		{
			if(Ref1.getNext()!=null)
				return true;
			else
				return false;
			
		}

		@Override
		public T next() 
		{
			if(Ref1!=null)
		      return (T) Ref1.getNext();     
			else
			  return null;
	    }
          
		@Override
		public void remove() 
		{
			// TODO Auto-generated method stub

		}
		  
		public T iterator() 
		{
			// TODO Auto-generated method stub
			return  (T) Ref1.getNext();
		}

		@Override
		public void iterate(int n) 
		{
			// TODO Auto-generated method stub
			 for(int i=0;i<n;i++)			 
			 {
				Ref1=Ref1.getNext(); 
			 }
		}

		@Override
		public T getdata() {
			// TODO Auto-generated method stub
			return (T) Ref1.getData();
		}
		
	}

	public IteratorCustomized<T> iterator()
	{
		// TODO Auto-generated method stub
		return new LinkListHelperIterator<T>();
	}
	
	public T getElement() 
	{
		Node Ref1 = null;
		// TODO Auto-generated method stub
		if(Ref1!=null) 
		{
			return  Ref1.getData();
		}
		return null;
	}	
	
	
}


