package com.reventure.arrays;

public class ThreadExample {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			new Thread(""+ i) {
				public void run() {
					System.out.println("thread: "+ getName()+ " running");
				}
			}.start();
		}
		// TODO Auto-generated method stub

	}

}
