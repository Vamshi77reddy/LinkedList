package com.bridgeLabz;

import linkedListcom.bridgeLabz.LinkedList;

public class Stack <T>{
	 LinkedList<T> linkedList = new LinkedList<>();

	    public void push(T data) {
	        linkedList.push(data);
	    }


	    public void show() {
	        linkedList.show();
	    }
	    public T pop() {
	        return linkedList.pop();
	    }
	    public void add(T data) {
	        linkedList.add(data);
	    }
}
