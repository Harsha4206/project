package com.gouse.linkedlist;

public class MyLinkedList {
	public int size=0;
	public Node top=null;

	public void push(int value) {
		Node temp = new Node();
		temp.data = value;
		temp.link=top;
		top=temp;
		size++;
		
		
	}
}
