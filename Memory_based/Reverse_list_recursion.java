package Memory_based;

import Memory_based.LinkedListHelper.Node;

public class Reverse_list_recursion<T> 
{
	LinkedListHelper<T> list;
	Reverse_list_recursion(LinkedListHelper<T> list1)
	{
	   list=list1;
	}
	public void reverse_recur(Node node)
	{
	  LinkedListHelper<T>.Node new_node=node;
	  
      if (new_node==null)
       return; 
 
      if (new_node.getNext()==null)
      {
        list.setHead((Node) new_node);
        return;  
      }
     
      //recursive condition.
     reverse_recur(new_node.getNext());  
     new_node.getNext().setLink((Node) new_node);
     new_node.setLink(null);   	
   
	}
}

