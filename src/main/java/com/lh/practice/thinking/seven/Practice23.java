package com.lh.practice.thinking.seven;

public class Practice23 extends parent {
	/*static int setAndPrint(String s){//但如果父类中的原方法为public则会出错
		System.out.println("child-setandPrint:"+s);
		return 2;
	}*/
	public static void main(String[] args) {
		Practice23 child=new Practice23();
		int chaf=child.after;
		System.out.println(chaf);
		child.setAndPrint("shishi");
	}
}
class parent{
	static int fir=0;
	//static int att=setAndPrint("att initialize"+fir);
	public static int after;
	static void ParentMethod(){
		after=9;
		System.out.println("ParentMethod init");
	}
	 final int setAndPrint(String s){
		System.out.println(s);
		return 1;
	}
	parent(){
		System.out.println("parent constructor");
	}
}