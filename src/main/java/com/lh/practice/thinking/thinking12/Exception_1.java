package com.lh.practice.thinking.thinking12;

public class Exception_1 {
	public static void main(String[] args) {
		try{
			System.out.println(1);
			throw new SimpleExcption("simple exception");
		}catch(SimpleExcption e){
			e.printStackTrace(System.out);
			System.out.println("where");
		}finally{
			System.out.println("fin");
		}
	}
}
class SimpleExcption extends Exception{
	SimpleExcption(String msg){
		super(msg);
	}

};