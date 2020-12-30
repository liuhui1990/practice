package com.lh.practice.thinking.thinking21.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ExecutorService exc=Executors.newCachedThreadPool();
		Future<String> f=exc.submit(new TaskWithResult(0));
		try {
			System.out.println(f.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class TaskWithResult implements Callable{
	private int i;
	public TaskWithResult(int i){
		this.i=i;
	}
	@Override
	public String call() throws Exception {
		return "result:"+i;
	}
	
}