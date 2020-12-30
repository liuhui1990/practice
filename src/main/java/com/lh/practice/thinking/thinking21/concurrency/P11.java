package com.lh.practice.thinking.thinking21.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P11 implements Runnable{
	private int a1=3;
	private int a2=999999999;
	private int counter=0;
	public void unChange(){
		double d=a1*Math.E;
		Thread.yield();
		a1=(int) (d/Math.E);
	}
	public void run(){
		while(isRight()){
			if(counter==a2) break;
			unChange();
			counter++;
		}
		System.out.println("a1 = "+a1);
	}
	public boolean isRight(){
		return a1==3;
	}
	public static void main(String[] args) {
		ExecutorService exec=Executors.newCachedThreadPool();
		for(int i=0;i<7;i++){
			exec.execute(new P11());
		}
		exec.shutdown();
	}
}
