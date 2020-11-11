package doublyLinkedList;
public class LinkedList<E> 
{
	private Node<E> head;
	private Node<E> tail;
	private int size=0;
	public LinkedList()
	{
		head=new Node<>(null,null,tail);
		tail=new Node<>(null,head, null); 
		head.setNext(tail);	
		tail.setPrev(head);
		
	}
	
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		if(size==0)
			return true;
		else
			return false;
	}
	public E getFirst()
	{
		if(isEmpty())
			return null;
		else
			return head.getNext().getElement();
	}
	public E last()
	{
		if(isEmpty())
			return null;
		else
			return tail.getPrev().getElement(); 
	}
	public void addFirst(E e)
	{
		addBetween(e,head,head.getNext());
		
	}
	private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		Node<E> newest=new Node<>(e,predecessor,successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;	
	}

	public void addLast(E e)
	{
		addBetween(e,tail.getPrev(),tail);
	}
	public E removeFirst() {
        if (size == 0) 
        	return null;
        Node<E> tmp = head;
        head = head.getNext();
        head.setPrev(null);
        size--;
        return tmp.getElement();
    }
    public E removeLast() {
        if (size == 0) 
        	return null;
        Node<E> tmp = tail;
        tail = tail.getPrev();
        tail.setNext(null);
        size--;
        return tmp.getElement();
    }
	
	
	private E remove(Node<E> node) {
		Node<E> predecessor=node.getPrev();
		Node<E> successor=node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		return node.getElement();
	}
	
	public void traverseForward()
	{
		Node<E> tmp=head.getNext();
		while(tmp!=null)
		{
			if(tmp==tail)
				break;
			System.out.print(tmp.getElement()+" ");
			tmp=tmp.getNext();
		}
		System.out.println();
	}
	
	public boolean contains(E e)
	{
		Node<E> tmp=head.getNext();
		while(tmp!=null)
		{
			if(tmp.getElement()==e)
				return true;
			tmp=tmp.getNext();
		}
		return false;
		
	}
	public E removeNthNode(int index)
	{
		Node<E> tmp=head;
		int i = 1;
		while(i<=index)
		{
			tmp=tmp.getNext();
			i++;
		}
		return remove(tmp);
	}
	public void addNode(int index , E e)
	{	
		Node<E> tmp=head.getNext();
		int i = 1;
		while(i<index)
		{	
			tmp=tmp.getNext();	
		}
		 addBetween(e,tmp.getPrev(),tmp);
	}
	
}