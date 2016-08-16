package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Stack stack = new Stack();

		stack.push("London");
		stack.push("Bangkok");
		stack.push("Paris");
		stack.push("Dubai");
		stack.push("Istanbul");
		stack.push("New York");
		stack.push("Singapore");
		stack.push("Kuala Lumpur");
		stack.push("Seoul");
		stack.push("Hong Kong");

		System.out.println(stack.pop());
		System.out.println(stack.peek());

        System.out.println("While loop with Iterator to retrieve data");

        Iterator it = stack.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



        System.out.println("Remove the  data");
        stack.remove(3);


        System.out.print("Use For Each loop to retrieve data");
        for(Object city:stack){
            System.out.println(city);
        }

		//System.out.println(stack.pop());
		//System.out.println(stack.pop());



	}

}
