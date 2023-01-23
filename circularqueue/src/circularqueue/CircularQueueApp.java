package circularqueue;

import java.util.Scanner;

public class CircularQueueApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of the circular queue");
	int n = scan.nextInt();
//	int n = new circularQueue(n);
	
	CircularQueue circularqueue = new CircularQueue(n);
	
	while(true)
	{
		System.out.println("Press 1 for insertion ----> insert");
		System.out.println("Press 2 for deletion ----> delete");
		System.out.println("Press 3 for display ----> display");
		System.out.println("Press anyother key to stop ----> stop");
		System.out.println("Enter your choice");
		int choice = scan.nextInt();
		switch(choice)
		{
		case 1:
			circularqueue.insert();
			break;
		case 2:
			circularqueue.delete();
			break;
		case 3:
			circularqueue.display();
			break;
		default :System.exit(0);
		}
	}
}
}
