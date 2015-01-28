package Memory_based;

/**
 * @author Amrita
 * This is the main program for reversing the linked list iteratively and recursively.
 */
public class main_class
{

	public static void main(String args[])
	{

		LinkedListHelper<Integer> list=new LinkedListHelper<Integer>();
		LinkedListHelper<Integer>.Node node=null;

		list.addAtStart(10);
		list.addAtStart(30);
		list.addAtStart(50);
		list.addAtStart(90);
		list.addAtStart(70);
		
		System.out.println("Main list:");
		list.Display();
		
		System.out.println("Linked list recursion by iteration:");		
		Reverse_iteration r = new Reverse_iteration();
		r.reverse(list);
		list.Display();	
		
		System.out.println("Linked list recursion by recursion:");
		Reverse_list_recursion r1=new Reverse_list_recursion(list);
		r1.reverse_recur(list.getHead());		
		list.Display();
	}
}
