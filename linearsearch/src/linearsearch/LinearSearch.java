package linearsearch;

import java.util.Scanner;

public class LinearSearch {
public static void main(String []args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter array length:");
	int n = scan.nextInt();
	int arr1 [] = new int[n];
	System.out.println("Enter array contents");
	for( int i=0;i<=arr1.length-1;i++)
	{
		System.out.println("Enter an element");
		arr1[i] = scan.nextInt();
		
	}
	
	System.out.println("Enter key to be search for:");
	int key = scan.nextInt();
	for(int i=0;i<=arr1.length-1;i++)
	{
		if(key == arr1[i])
		{
			System.out.println("Key found at index " + i);
			System.exit(0);
		}
	}
	
	System.out.println("Key is not found");
}
}
