package com.lh.practice.thinking.ten;

public class Closure {
	public static void main(String[] args) {
		Call1 c1=new Call1();
		Call2 c2=new Call2();
		MyIncrement.f(c2);
		Call caller1=new Call(c1);
		Call caller2=new Call(c2.getCBR());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}
}
interface Incrementable{
	void increment();
}
class Call1 implements Incrementable{
	private int i=0;
	@Override
	public void increment(){
		i++;
		System.out.println("from Call1,i:"+i);
	}
}
class MyIncrement{
	public void increment(){
		System.out.println("my operation");
	}
	static void f(MyIncrement mi){mi.increment();};
}
class Call2 extends MyIncrement{
	private int i=0;
	@Override
	public void increment(){
		super.increment();
		i++;
		System.out.println("from call2,i:"+i);
	}
	private class clo implements Incrementable{
		@Override
		public void increment(){
			Call2.this.increment();
		}
	}
	Incrementable getCBR(){
		return new clo();
	}
}
class Call{
	private final Incrementable cbr;
	Call (Incrementable cbh){
		cbr=cbh;
	}
	void go(){
		cbr.increment();
	}
}