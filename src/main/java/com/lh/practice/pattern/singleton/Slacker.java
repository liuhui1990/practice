package com.lh.practice.pattern.singleton;

public class Slacker {
	private Slacker(){}
	private static Slacker instance;
	public static Slacker getInstance(){
		if(instance==null)
			instance=new Slacker();
		return instance;
	}
	public static void main(String[] args) {
		SlackerThreadSafe st=SlackerThreadSafe.getInstance();
		SlackerThreadSafe st2=SlackerThreadSafe.getInstance();
		SlackerThreadSafe st3=SlackerThreadSafe.getInstance();
	}
}
