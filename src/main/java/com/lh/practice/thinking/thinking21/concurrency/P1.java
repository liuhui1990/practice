package com.lh.practice.thinking.thinking21.concurrency;

public class P1 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			new Thread(new R1()).start();
		}
	}
}
class R1 implements Runnable{
	public R1(){
		System.out.println("starting msg");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
			System.out.println("now is:"+i);
			Thread.yield();
		}
		System.out.println("ending msg");
	}
	
}
