package Memory_based;

import Memory_based.LinkedListHelper.Node;

public class Merge_point<T>
{
	 public void merge_list(LinkedListHelper<T> list1,LinkedListHelper<T> list2)
	  {
		 
		 LinkedListHelper<T>.Node m2=null;		 
		 
		 LinkedListHelper<T>.Node m1=list2.getHead();
		 
		 while(m1.getNext()!=null)
		 {
			 m1=m1.getNext();
		 }	
		 m2=(Node) list1.GetNodeAt(2);	
		 m1.setLink(m2);
		 list2.Display();
	  }
	  public <T> T merge_point(LinkedListHelper<T> list1,LinkedListHelper<T> list2)
	  {
		        
		  LinkedListHelper<T>.Node node_point1=null;
		  node_point1=list1.getHead();
		  LinkedListHelper<T>.Node node_point2=null;
		  node_point2=list2.getHead();
		  int count=0;
		  int i,j;
		  int count1=0;
		  int count2=0;
	    
		  if(list1.IsEmpty() || list2.IsEmpty())
			  return null;
		  for(i=0;i<list1.getSize();i++)
		  {
			  count1++;
		  }
		  for(j=0;j<list2.getSize();j++)			
		  {
			  count2++;
		  }  
		  
		  int result=Math.abs(count1-count2);
		  
		  if(list1.getSize()>list2.getSize())
		  {
			  while(result>count)
			  {
				  node_point1=node_point1.getNext();
				  count++;
			  }
		  }
		
		  else
		  {
			  while(result>count)
			  {
				  node_point2=node_point2.getNext();
				  count++;
			  } 
		  }
 
		  while(node_point1!=null && node_point2!=null)
		  {		 
			  if(node_point1.getData()==node_point2.getData())
				  return node_point1.getData(); 			 
			  node_point1=node_point1.getNext();
			  node_point2=node_point2.getNext();
			  //System.out.println(node_point1.getData()+" "+node_point2.getData());
			  
			  if(node_point1==null)
			  {
				  return node_point2.getData();
			  }
			  else if(node_point2==null)
			  {
				  return node_point1.getData();
			  }
				
			 /* if(node_point1==null)
			  {
				  node_point2=node_point2.getNext();
			      return node_point2.getData();
			  }
			  else if(node_point2==null)
			  {
				  node_point1=node_point1.getNext();
			  return node_point1.getData();
			  } */
		  }
		  return null;		  		  
	  }	
}
