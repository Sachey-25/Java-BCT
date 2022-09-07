package com.bct.data.structures;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	/*
	 * A queue is desinged in such way that the elements added to it are placed at the
	 * end of Queue and removed from the beginning of the Queue. 
	 * 
	 * operation -- FIFO (First in first out)
	 * 
	 * 
	 *				    Queue -- parentClass
	 *           **						**
	 * 		Linkedlist                  priority Queue  
	 */

	public static void main(String[] args) {
		/* 
		 * We can not create an instance of a Queue as it is an interface
		 * we can create instance pf LinkedList or priorityQueue and assign it to the 
		 * Queue.
		 */
		//Create a queue
		Queue<String> queue=new LinkedList<String>();
		
		
		//Adding the elements to the Queue
		queue.add("Sachin");
		queue.add("Tendulkar");
		queue.add("virendra");
		queue.add("sehwag");
		
		System.out.println("Elements of the Queue : " + queue);
		
		//Creating queue with the reference of priorityQueue
		Queue<String> anotherQ=new PriorityQueue<String>();
		
		//System.out.println("------------Below is another Queue-------------");
		//Adding the elements to the Queue
		anotherQ.add("virendra");
		anotherQ.add("sehwag");
		anotherQ.add("Tendulkar");
		anotherQ.add("Sachin");
		
		// System.out.println("Elements of the Queue : " + anotherQ);
		
		//We can remove the element from Queue using remove();
		System.out.println("Removed element is : " + queue.remove());
		
		/*
		 * element() method-- this returns the head of the Queue. Head is the first element.
		 * 
		 */
		System.out.println("Head of the element : " + queue.element());
		
		//poll() method -- this removes and retunrs the head of Queue. 
		// Returns null if the Queue is empty.
		System.out.println("Poll() :----> " + queue.poll());
		
		System.out.println(" Elements of Queue after remove() and poll() " + queue);
		
		/*
		 * The methods of Queue are
		 * 1. E element()
		 * 2. E remove()
		 * 3. E poll()
		 * 4. E peek()
		 * 5. E remove()
		 * 6. boolean add(E e)
		 */


	}

}
