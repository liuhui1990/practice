package com.lh.practice.thinking.thinking21.concurrency;

public class Joining {
	public static void main(String[] args) {
		Sleeper s1=new Sleeper("s1",1500);
		Joiner j1=new Joiner(s1,"j1");
		s1.interrupt();
	}
}
class Sleeper extends Thread{
	private int sleepTime;
	public Sleeper(String name,int s){
		super(name);
		this.sleepTime=s;
		start();
	}
	public void run(){
		System.out.println("sleeper "+getName()+" has started.");
		try {
			sleep(sleepTime);
		} catch (InterruptedException e) {
			System.out.println("sleeper: "+getName()+" was interrupted:"+isInterrupted());
			//e.printStackTrace();
		}
		System.out.println("sleeper "+getName()+" has ended.");
	}
}
class Joiner extends Thread{
	private Sleeper sleeper;
	public Joiner(Sleeper sleeper,String name){
		super(name);
		this.sleeper=sleeper;
		start();
	}
	public void run(){
		System.out.println("Joiner "+getName()+" has started.");
		try {
			sleeper.join();
		} catch (InterruptedException e) {
			System.out.println("joiner "+getName()+" was interrupted:"+isInterrupted());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("joiner "+getName()+" has ended.");
	}
}