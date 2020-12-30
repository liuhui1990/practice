package com.lh.practice.pattern.singleton;

public class StaticInner {
	private StaticInner(){
		System.out.println("StaticInner has been initilaized");
	}
	private static class Holder{
		static final StaticInner instance=new StaticInner();
	}
	public static StaticInner getInstance(){
		return Holder.instance;
	}
	public static void main(String[] args) {
		System.out.println("src/test/test");
		StaticInner.getInstance();
	}
}
