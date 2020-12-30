package com.lh.practice.thinking.thinking21.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P15 {
	private String s1="";
	private String s2="";
	private int i1;
	public void m1(){
		synchronized(s1){
			for(int i=0;i<5;i++){
				System.out.println("from m1()");
				Thread.yield();
			}
		}
	}
	public void m2(){
		synchronized(s1){
			for(int i=0;i<5;i++){
				System.out.println("from m2()");
				Thread.yield();
			}
		}
	}
	public void m3(){
		synchronized(this){
			for(int i=0;i<5;i++){
				System.out.println("from m3()");
				Thread.yield();
			}
		}
	}
	public static void main(String[] args) {
		final P15 p15=new P15();
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(new Thread(){
			public void run(){
				p15.m1();
			}
		});
		new Thread(){
			public void run(){
				p15.m2();
			}
		}.start();
		p15.m3();
	}
}
