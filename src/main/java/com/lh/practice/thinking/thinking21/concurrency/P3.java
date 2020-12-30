package com.lh.practice.thinking.thinking21.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P3 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newCachedThreadPool();
		for(int i=0;i<3;i++){
			es.execute(new R1());
		}
		System.out.println("\n");
		ExecutorService es2=Executors.newFixedThreadPool(3);
		for(int i=0;i<3;i++){
			es2.execute(new R1());
		}
		ExecutorService es3=Executors.newSingleThreadExecutor();
		for(int i=0;i<3;i++){
			es3.execute(new R1());
		}
	}
}
