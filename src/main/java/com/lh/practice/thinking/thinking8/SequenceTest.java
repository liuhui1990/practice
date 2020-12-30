package com.lh.practice.thinking.thinking8;

public class SequenceTest {
	public static void main(String[] args) {
		new Son();
	}
}
class Father{
	Father(){
		System.out.println("father() constructor");
	}
	private final int a1=me(1);
	int a2=me(2);
	static int a3=me(3);
	final int a4=me(4);
	private static int me(int in){
		System.out.println("inf:"+in);
		return in;
	}
}
class Son extends Father{
	Son (){
		System.out.println("son cons");
	}
	private final int a1=me(1);
	int a2=me(2);
	static int a3=me(3);
	final int a4=me(4);
	private static int me(int in){
		System.out.println("ins:"+in);
		return in;
	}
}