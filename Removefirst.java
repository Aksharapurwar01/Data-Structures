package bridgelabz;

//Java code to illustrate removeFirst() method
import java.io.*;
import java.util.LinkedList;

public class Removefirst {
	public static void main(String args[])
	{
		// Creating an empty LinkedList
		LinkedList<String> list = new LinkedList<String>();

		// Using add() method to add elements in the list
		list.add("56");
		list.add("30");
		list.add("70");
		
		

		// Displaying the list
		System.out.println("LinkedList:" + list);

		// Remove the head using removeFirst() method
		System.out.println("The first element is: " + list.removeFirst());

		// Displaying the final list
		System.out.println("Final LinkedList:" + list);
	}
}

