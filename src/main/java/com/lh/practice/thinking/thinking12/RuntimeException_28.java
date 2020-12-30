package com.lh.practice.thinking.thinking12;

public class RuntimeException_28 {
	public static void main(String[] args) {
		thrRec();
	}
	static void thrRec(){
		throw new rec("hhh");
	}

}
class rec extends RuntimeException{
	private final String msg;
	public rec(String msg){
		this.msg=msg;
	}
}