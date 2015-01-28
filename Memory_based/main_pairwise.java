package Memory_based;

public class main_pairwise
{
	public static void main(String args[])
	{
	LinkedListHelper<Integer> list=new LinkedListHelper<Integer>();
    list.addAtStart(10);
    list.addAtStart(20);
    list.addAtStart(30);
	list.addAtStart(50);
	list.addAtStart(90);
	list.addAtStart(70);
	System.out.println("Main list:");
	list.Display();
	
	Pairwise_swap_iterative p=new Pairwise_swap_iterative(list);
	LinkedListHelper<Integer>.Node first=first=list.getHead();
	LinkedListHelper<Integer>.Node second=second=first.getNext();
	
	p.paired_swapping(list.getHead());
	list.Display();
	}
	
}
