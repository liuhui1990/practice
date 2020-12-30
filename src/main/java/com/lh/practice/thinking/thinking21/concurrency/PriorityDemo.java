package com.lh.practice.thinking.thinking21.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PriorityDemo implements Runnable{

	@Override
	public void run() {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println(this);
	}
	public String toString(){
		Thread th=Thread.currentThread();
		return th.getName()+" "+th.getPriority();
	}
	public static void main(String[] args) {
		ExecutorService exc=Executors.newCachedThreadPool();
		exc.execute(new PriorityDemo());
	}
}
