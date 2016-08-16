package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		List<Object> list = new ArrayList<Object>();
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

		//System.out.println("After : " + list.size());


	}

}
