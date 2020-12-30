package com.lh.practice.thinking.thinking12;

public class CauseException_10 {
	public static void main(String[] args) {
		CauseException_10 ce=new CauseException_10();
		ce.g();
	}
	public void f() throws MyException{
		MyException me=new MyException();
		me.initCause(new RuntimeException());
		throw me;
	}
	public void g(){
		try{
			f();
			System.out.println(233);
			throw new E2();
		}catch(MyException e){
			e.printStackTrace(System.out);

		}catch(E2 e){
			e.printStackTrace();
		}
	}
	class MyException extends Exception{
		MyException(){
			System.out.println("this is MyException");
		}
	}
	class E2 extends Exception{
		E2(){
			System.out.println("this is E2");
		}
	}
}
