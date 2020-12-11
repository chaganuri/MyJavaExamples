package com.collections;

class ChildThread implements Runnable{

	@Override
	public void run() {
		System.out.println("ChildThread.run()::Thread Started :: "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ChildThread.run()::Thread Ended :: "+Thread.currentThread().getName());
	}
	
}

public class JoinTest {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ChildThread(), "t1");
		Thread t2 = new Thread(new ChildThread(), "t2");
		Thread t3 = new Thread(new ChildThread(), "t3");
		/**
		 * Here, Main thread is calling t1.join() means, main thread will wait till the t1 completes the execution.
		 * After t1 completes the control will be will be given back to main thread then it starts t2 thread. whenever t2.join() is encountered 
		 * main thread waits till t2 completes.
		 * Like this t3 thread will get executed.
		 */
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t3.start();
		
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("JoinTest.main()::All Threads got Finished");
	}

}
