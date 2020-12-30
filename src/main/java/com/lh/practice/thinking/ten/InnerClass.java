package com.lh.practice.thinking.ten;

public class InnerClass {
	public static void main(String[] args) {
		Outer.Inner c=new Outer().getI();
	}
}
class Outer{
	class Inner{

	}
	public Inner getI(){
		return new Inner();
	}
}