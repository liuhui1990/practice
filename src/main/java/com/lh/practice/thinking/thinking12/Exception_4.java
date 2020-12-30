package com.lh.practice.thinking.thinking12;

public class Exception_4 {
	public static void main(String[] args) {
		Ex e=new Ex("yy");
		try {
			e.tro();
		} catch (Ex e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace(System.out);
		}
	}
}
class Ex extends Exception{
	private final String msg;
	Ex(String msg){
		super(msg);
		this.msg=msg;
	}
	public void show(){
		System.out.println(msg);
	}
	public void tro() throws Ex{
		System.out.println("tro start");
		throw new Ex("hh");

	}
}