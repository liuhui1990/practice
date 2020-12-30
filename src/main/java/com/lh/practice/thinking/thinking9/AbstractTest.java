package com.lh.practice.thinking.thinking9;

public class AbstractTest {
	public static void main(String[] args) {
		a1c hh=new a1c();
		hh.print();
	}
}
abstract class a1{
	protected final int aa;
	a1(){
		aa=9;
	}
	void print(){

	}
}
class a1c extends a1{
	private int i;
	void change(){
		i=this.aa;
	}
	@Override
	void print(){
		System.out.println("i:"+i);
	}
}