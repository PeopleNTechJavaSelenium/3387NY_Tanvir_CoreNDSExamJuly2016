package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> queue = new LinkedList<String>();

		queue.add("London");
		queue.add("Bangkok");
		queue.add("Paris");
		queue.add("Dubai");
		queue.add("Istanbul");
		queue.add("New York");
		/*queue.add("Singapore");
		queue.add("Kuala Lumpur");
		queue.add("Seoul");
		queue.add("Hong Kong");*/

		System.out.println(queue.element());
		System.out.print("While loop with Iterator to retrieve data");

		Iterator it = queue.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println("Use PEEK to retrieve data");
		System.out.println(queue.peek());

		System.out.println("Remove the  data");
	     queue.remove(3);


		System.out.print("Use For Each loop to retrieve data");
		for(Object city:queue){
			System.out.println(city);
		}





	}

}
