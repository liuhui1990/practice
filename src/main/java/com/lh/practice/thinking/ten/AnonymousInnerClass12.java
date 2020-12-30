package com.lh.practice.thinking.ten;

public class AnonymousInnerClass12 {
	public Ineat getRab(){
		return new Rabbit(){
			@Override
			public void swollow (){
				System.out.println("swollow");
			}
		};
	}
}
interface Ineat{
	void swollow();
}
class Rabbit implements Ineat{
	void run(){
		System.out.println("run");
	}

	@Override
	public void swollow() {
		// TODO Auto-generated method stub
		System.out.println("swollow");
	}
}