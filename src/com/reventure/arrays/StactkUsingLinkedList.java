package com.reventure.arrays;

public class StactkUsingLinkedList {
	protected Node top;
	protected int size;
	
	public  class Node{
		protected Node top;
		protected int size;
	}
	public StactkUsingLinkedList() {
		 top=null;
	     size=0;
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
	public void push(int top) {
		
	}
	public void pop() {
		
	}
	public int peek() {
		
	}
	public boolean isEmpty() {
		return top == null;
	}
	public static void main(String[] args) {
		StactkUsingLinkedList sacn= new StactkUsingLinkedList();

	}

}
