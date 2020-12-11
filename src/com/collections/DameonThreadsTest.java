package com.collections;

import java.util.Set;

public class DameonThreadsTest {

	public static void main(String[] args) {
		
		//To know the no of threads are running in JVM
		Set<Thread> runningThreads = Thread.getAllStackTraces().keySet();
		System.out.println("\n\n");
		for(Thread t : runningThreads) {
			System.out.println("StreamAPITest.main()::Name = "+t.getName()+" State = "+t.getState()+" Priority = "+t.getPriority()+" Dameon = "+t.isDaemon());
		}
		//Check the Dameon nature of Main Thread
		System.out.println("DameonThreadsTest.main()::Is Main Thread is Dameon = "+Thread.currentThread().isDaemon());
		/**
		 * Main Thread is not Dameon Thread
		 * Changing the main thread to Dameon is not possible - bcoz we have to set the Dameon nature before starting the Thread
		 * As main thread has started already by JVM we can't set to Dameon, Else will get java.lang.IllegalThreadStateException
		 */
		//java.lang.IllegalThreadStateException
		//Thread.currentThread().setDaemon(true);
		
		Thread t = new Thread();
		System.out.println("DameonThreadsTest.main()::Is Current Thread is Dameon = "+t.isDaemon());
		t.setDaemon(true);
		System.out.println("DameonThreadsTest.main()::Is Current Thread is Dameon = "+t.isDaemon());
		t.start();
		System.out.println("DameonThreadsTest.main()::Thread "+t.getName()+" has already started");
		t.start();
		

	}

}
