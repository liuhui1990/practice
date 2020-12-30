package com.lh.practice.problem;

public class Timer {
	private static long start;
	public static void start(){
		start=System.currentTimeMillis();
	}
	public static void end(){
		System.out.println("运行耗时："+(System.currentTimeMillis()-start)+" ms");
	}
}
