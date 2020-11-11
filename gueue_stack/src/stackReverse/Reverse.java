package stackReverse;

public class Reverse<E> {

	int size=0;
	int count=0;
	int top;
	private int[] stackArray;
	

	public void Stack(int s)
	{
		size=s;
		 stackArray=new int[size];
		top=-1;
	}
	
	public void push(E deger)
	{
		stackArray[++top]=(int) deger;
		count++;
	}
	
	public int pop()
	{
		return stackArray[top--];
		
	}
	
	public void peek()
	{
		if(isEmpty())
			System.out.print("Liste boþ!");
		else
			System.out.print(stackArray[top]);
	}
	

	public boolean isEmpty()
	{
		return top==-1;
	}
}
