package com.lh.practice.thinking.thinking21.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P21 {
	public static void main(String[] args) {
		ExecutorService exec=Executors.newCachedThreadPool();
		Run1 r1=new Run1();
		exec.execute(r1);
		exec.execute(new Run2(r1));
	}
	
}
class Run1 implements Runnable{
	public Run1(){
		System.out.println(this);
	}
	public void run(){
		waitR1();
	}
	public synchronized void waitR1(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run1 is awake");
	}
}
class Run2 implements Runnable{
	private final Run1 r1;
	/*static{
		r1=new Run1();
	}*/
	public Run2(Run1 r1){
		this.r1=r1;
	}
	public void run(){
		notifyR1();
	}
	public void notifyR1(){
		synchronized(r1){
			r1.notifyAll();
			System.out.println("r1 no");
		}
	}
}