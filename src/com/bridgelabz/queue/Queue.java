package com.bridgelabz.queue;

import com.bridgelabz.LinkedList.LinkedList;

public class Queue<E> {
	
	private LinkedList<E> linkedList = new LinkedList<>();
	
/* adding items in Queue (adding tail)*/	
	public void enqueue(E item) {
		linkedList.append(item);
	}
	
/*showing the full Queue*/
	public void display() {
		linkedList.display();
	}
	
}