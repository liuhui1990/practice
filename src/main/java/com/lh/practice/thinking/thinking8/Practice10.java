package com.lh.practice.thinking.thinking8;

public class Practice10 {
	private final cheng1 che=new cheng1();
	public static void p1(Parent parent){
		parent.method1();
	}
	public static void main(String[] args) {
		//Child cd=new Child();
		Parent cd=new Child();
		Parent pa=new Parent();
		Practice10.p1(pa);
	}
}
class cheng1{
	cheng1(){
		System.out.println("cheng1 constructor");
	}
}
class Parent {
	public void method1(){
		method2();
		System.out.println("pm1");
	}
	public void method2(){
		System.out.println("pm2");
	}
}
class Child extends Parent{
	@Override
	public void method2(){
		System.out.println("cm2");
	}
}