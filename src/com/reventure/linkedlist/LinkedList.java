package com.reventure.linkedlist;

public class Node {
	protected Node top;
	protected int size;


}

public class Main {
	protected Node top;
	protected int size;

	public Main () {
		top = null;
		size = 0;
	}

	public Node getTop() {
		return top;
	}

	public void setTop(Node top) {
		this.top = top;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int push( ) {
		return 

	}

	public int pop() {
		return top;

	}

	public boolean isFull() {
		return top > 0 ? true : false;
	}

	public boolean isEmpty() {
		return top < 0 ? true : false;
	}
}
