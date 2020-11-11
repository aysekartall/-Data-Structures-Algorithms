package doublyLinkedList;

public class main 
{

	public static void main(String[] args)
	{			
		LinkedList<Integer> dList= new LinkedList<Integer>();
		
		dList.addFirst(5);
		dList.addFirst(10);
		dList.addFirst(15);
		dList.addFirst(20);
		
		System.out.println(dList.getFirst());
		dList.traverseForward();
		
		dList.addFirst(25);
		dList.traverseForward();
		
		dList.removeFirst();
		dList.traverseForward();
		
		dList.addLast(4);
		dList.traverseForward();
		
	    dList.removeLast();
		dList.traverseForward();
		
		System.out.println(dList.contains(10));
		dList.traverseForward();

		System.out.println(dList.removeNthNode(2));
		dList.traverseForward();
		
		dList.addNode(1, 30);
		dList.traverseForward();

	}
}
