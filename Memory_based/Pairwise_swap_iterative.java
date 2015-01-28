package Memory_based;  

import Memory_based.LinkedListHelper.Node;

public class Pairwise_swap_iterative
{	
	 Pairwise_swap_iterative(LinkedListHelper<Integer> list1)
	{
		   LinkedListHelper<Integer> list = list1;
	}
     void paired_swapping(Node node)
     {
    	  LinkedListHelper<Integer>.Node new_node=node;
    	  LinkedListHelper<Integer>.Node next_node=node;   	      	  
    	  if (new_node==null || new_node.getNext()==null)
    	        return ;
    	  //keep a pointer to next element of front
    	  next_node=new_node.getNext();
    	  //make front point to next element
    	  
    	  /*front.next=current.next;
    	  current.next=front;
    	  front=current;
    	    //current has moved one step back it points to first.
    	    //so get it to the finished swap position
    	    current=current.next;
    	    while(current.next!=null && current.next.next!=null)
    	    {
    	        ListNode temp = current.next.next;
    	        current.next.next=temp.next;
    	        temp.next=current.next;
    	        current.next=temp;
    	        current=temp.next;
    	        
    	  /*while(node!=null)
    	  {
    	  swap(new_node,new_node.getNext());
    	  new_node=new_node.getNext().getNext();
    	  }*/
    	  
     }
     
}
