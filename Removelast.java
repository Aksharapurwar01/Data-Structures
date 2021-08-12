package bridgelabz;


import java.io.*;
import java.util.LinkedList;

public class Removelast {
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
		System.out.println("The first element is: " + list.removeLast());

		// Displaying the final list
		System.out.println("Final LinkedList:" + list);

}
}
