package com.collections;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CalSumOf1000 implements Callable<Long>{

	@Override
	public Long call() throws Exception {
		Long sum = 0L;
		for(int i=1;i<=1000;i++) {
			sum += i;
		}
		return sum;
		
	}
	
}


public class ExecutorCallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newFixedThreadPool(1);
		
		CalSumOf1000 calcSumOf1000 = new CalSumOf1000();
		
		Future<Long> sum = service.submit(calcSumOf1000);
		
		System.out.println("ExecutorCallableDemo.main()::Sum = "+sum.get());

	}

}
