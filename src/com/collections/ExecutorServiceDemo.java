package com.collections;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{
	
	String name;
	PrintJob(String name){
		this.name = name;
		
	}

	@Override
	public void run() {
		System.out.println(name+" Job Started by Thread "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		PrintJob[] jobs = {new PrintJob("A"),
							new PrintJob("B"),
							new PrintJob("C"),
							new PrintJob("D"),
							new PrintJob("E"),
							new PrintJob("F")};
		ExecutorService service = Executors.newFixedThreadPool(6);
		System.out.println("ExecutorServiceDemo.main()"+service.getClass().getName());
		for (PrintJob printJob : jobs) {
			service.submit(printJob);
		}
		service.shutdown();
		

	}

}
