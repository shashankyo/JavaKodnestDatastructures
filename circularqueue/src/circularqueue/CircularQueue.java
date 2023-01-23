package circularqueue;

import java.util.Scanner;

public class CircularQueue {
//public static CircularQueue CicularQueue;
private int cq[];
private int size;
private int r=-1;
private int f=0;
private int count = 0;
Scanner scan = new Scanner(System.in);
public CircularQueue(int n)
{
	cq = new int[n];
//	int cqlength = 0;
	size = cq.length;
}

public void insert()
{
	if (count == size)
	{
		System.out.println("Insertion not possible");
	}
	else
	{
		System.out.println("Enter an element");
	
	int elem = scan.nextInt();
	r = (r+1)%size;
	cq[r] = elem;
	count ++;
}
}
public void delete()
{
	if(count ==0)
	{
		System.out.println("Deletion not possible");
		
	}
	else {
		System.out.println("element delted is "+cq[f]);
		f = (f+1)%size;
		count --;
	}
	
}
public void display()
{
	int f1 = f;
	if(count == 0)
	{
		System.out.println("Display not possible");
	}
	else 
	{
		for(int i=1;i<=count;i++)
		{
			System.out.println(cq[f]+" ");
			f = (f+1)%size;
		}
		System.out.println();
	}
}

}
