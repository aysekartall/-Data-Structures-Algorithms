package queue;

public class PriorityQueue {


	private int size;
	private int[] pQueueArray;
	private int rear, front, count;
public PriorityQueue(int s)
{

	size = s;
	pQueueArray = new int[size];
	front = -1;
	rear = 0;
	int count = 0;
}

public boolean isEmpty() {
	return count == 0;
}

public boolean isFull() {
	return count == pQueueArray.length; 
	                 //size
}
	
public void enqueue(int deger)
{
	if(isFull())
	System.out.println("Kuyruk Dolu!");
	
	else
	{
		
		for(int i = count-1;i>=0;i--)
			{
			if((int) deger>(int)pQueueArray[i])
				pQueueArray[i+1]=pQueueArray[i];
			else
				break;
			}
		int i = 0;
		pQueueArray[i+1]=deger;
		front++;
			}
	
}

public int dequeue() 
{
	int temp;
	if (isEmpty()) 
		System.out.println("Kuyruk boþ");
		temp=pQueueArray[front];
		pQueueArray[front]=(Integer) null;
		front--;
		count--;
		return temp;
		
		
}

public void print() {
	for (int i = 0; i <= front; i++) {
		System.out.print(pQueueArray[i] + " ");
	}
	System.out.println();
}	
}

