import java.util.Scanner;
//Linear probing
public class Hashing 
{
	private int currentSize, maxSize;
	private int[] keys;
	private int[] vals;
	
	public Hashing(int capacity) 
	{
		currentSize = 0;
		maxSize = capacity;
		keys = new int[maxSize];
		vals = new int[maxSize];
		for(int i=0;i<maxSize;i++)
		{
			keys[i]=i;
			vals[i]=-1;
		}
	}
	private int hash(int key) 
	{
		return key%maxSize;
	}
	public void insert(int val) 
	{
		int tmp=hash(val);
		int i=tmp;
		do {
			if(vals[i]==-1)
			{
				keys[i]=i;
				vals[i]=val;
				currentSize++;
				return;
			}
			else {
				while(vals[i]!=-1)
				{
					i=(i+1)%maxSize;
				}
				vals[i]=val;
				return;
			}
		}
		while(i!=tmp);	
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		Hashing linearProbing = new Hashing(sc.nextInt());
	}

}
