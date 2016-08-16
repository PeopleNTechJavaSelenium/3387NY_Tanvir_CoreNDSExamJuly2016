package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

        LinkedList<String> list = new LinkedList<>();
        //LinkedList list2 = new LinkedList();

		list.add("London");
		list.add("Bangkok");
		list.add("Paris");
		list.add("Dubai");
		list.add("Istanbul");
		list.add("New York");
		list.add("Singapore");
		list.add("Kuala Lumpur");
		list.add("Seoul");
		list.add("Hong Kong");


		System.out.println("The Most Popular "+ list.size() + " Cities In The World To Visit");

        System.out.println("Head of the list:" + list.peek());

		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		list.remove(5);
		System.out.println("") ;
		System.out.println("After Remove one City : " + list.size());

		System.out.println("") ;

		for(Object city:list){
			System.out.println(city);
		}





	}

}
