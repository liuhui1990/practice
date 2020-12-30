package com.lh.practice.thinking.thinking21.concurrency;

public class P6 {
	private final int n;
	private Thread t;
	public void runTask(){
		t=new Thread(){
			public void run(){
				int fib=1;
				int last=1;
				for(int i=0;i<n;i++){
					System.out.println(fib+" ");
					int temp=fib;
					fib=last+fib;
					last=temp;
				}
			}
		};
		t.start();
	}
	public P6(int n){
		this.n=n;
	}
	public static void main(String[] args) {
		P6 p=new P6(10);
		p.runTask();
	}
}
