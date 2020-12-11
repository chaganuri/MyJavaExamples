package com.collections;


class Thread1 extends Thread{
	
	public void run() {
		//System.out.println("\n\n");
		for(int i=1; i<=3; i++) {
			System.out.println("Thread1.run()::Iteration = "+i);
			Thread.yield();
		}
	}
}
class Thread2 extends Thread{
	
	public void run() {
		//System.out.println("\n\n");
		for(int i=1; i<=3; i++) {
			System.out.println("Thread2.run()::Iteration = "+i);
		}
	}
}

public class YeildTest {

	public static void main(String[] args) {
		 
		Thread1 thread1 = new Thread1();
		thread1.start();
		Thread2 thread2 = new Thread2();
		thread2.start();
	}

}
