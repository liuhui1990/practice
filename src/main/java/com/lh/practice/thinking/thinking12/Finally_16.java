package com.lh.practice.thinking.thinking12;

public class Finally_16 {
	private static boolean kaiguan=false;
	public static void main(String[] args) {
		close();
	}
	public static void f() throws NullPointerException{
		throw new NullPointerException();
	}
	public static void close(){
		if (kaiguan==false){
			try {
				f();
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				System.out.println("perform clean");
			}
			//throw new NullPointerException();
		}else{
			kaiguan=false;
		}
	}
}
