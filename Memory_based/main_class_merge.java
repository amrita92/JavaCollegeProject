package Memory_based;

/**
 * @author Amrita
 * This is the main program for finding the merge point of linked list.
 */
public class main_class_merge
{
	public static void main(String args[])
	{

		LinkedListHelper<Integer> list1=new LinkedListHelper<Integer>();
		LinkedListHelper<Integer>.Node merge_node=null;
		
		//This is the first list.
		list1.addAtStart(89);
		list1.addAtStart(10);
		list1.addAtStart(30);
		list1.addAtStart(50);
		list1.addAtStart(70);
		list1.addAtStart(90);
		
		list1.Display();
				
		LinkedListHelper<Integer> list2=new LinkedListHelper<Integer>();	
	    
		//Second list.
		list2.addAtStart(20);
		list2.addAtStart(40);
		list2.addAtStart(60);
		list2.addAtStart(80);
		list2.Display();
		
		//System.out.println(list2.getHead().getData());
		Merge_point M=new Merge_point();
		M.merge_list(list1, list2);
		
		//list1.Display();
		//list2.Display();
		System.out.println("The merge point is :" +M.merge_point(list1, list2));
		
	}
	
}
