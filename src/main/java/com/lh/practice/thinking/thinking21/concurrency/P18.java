package com.lh.practice.thinking.thinking21.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class P18 {
	public static void main(String[] args) {
		System.out.println("test start");
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(new Task());
		Thread t=new Thread(new Task());
		t.start();
		t.interrupt();
		//Future<?> f=exec.submit(new Task());
		//f.cancel(true);
		/*try {
			//f.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//exec.shutdown();
		}
		f.cancel(true);*/
		System.out.println("shutdown now");
		//exec.shutdownNow();
		System.out.println("this is the end");
	}
}
class SleepHolder{
	public static void sleepp(){
		try {
			for(int i=0;i<4;i++){
				System.out.println("starting to sleep time "+i);
				TimeUnit.SECONDS.sleep(1);
				System.out.println("awake "+i);
			}
		} catch (InterruptedException e) {
			System.err.println("sleepp() is interrupted");
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
}
class Task implements Runnable{
	public void run(){
		SleepHolder.sleepp();
	}
}