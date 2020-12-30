package com.lh.practice.thinking.thinking21.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class P10 {
	private Callable<Integer> c;
	private int last=0;
	private int fib=1;
	private int sum=0;
	public Future<Integer> runTask(int n){
		c=new Callable<Integer>(){
			@Override
			public Integer call() throws Exception {
				sum=sum+fib;
				int temp=last+fib;
				last=fib;
				fib=temp;
				return sum;
			}
		};
		ExecutorService exc=Executors.newCachedThreadPool();
		for(int i=0;i<n-1;i++){
			exc.submit(c);
		}
		Future<Integer> f=exc.submit(c);
		return f;
	}
	public static void main(String[] args) {
		P10 p10=new P10();
		Future<Integer> f=p10.runTask(5);
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
