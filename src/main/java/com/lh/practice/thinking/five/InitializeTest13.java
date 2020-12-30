package com.lh.practice.thinking.five;

public class InitializeTest13 {
	public static void main(String[] args) {
		System.out.println("main's first");
		Cups.cup1.f(99);
		Cups cups3=new Cups("33");
	}
	static Cups cups1=new Cups("1");
	static Cups cups2=new Cups("2");
}
class Cup{
	Cup(){
		System.out.println("cup()");
	}
	Cup(int marker){
		System.out.println("cup("+marker);
	}
	void f(int marker){
		System.out.println("f("+marker);
	}
}
class Cups{
	static Cup cup1;
	static Cup cup2;
	static {
		cup1=new Cup(1);
		cup2=new Cup(2);
	}
	Cups(String marker){
		System.out.println("cups("+marker);
	}
}