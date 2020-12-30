package com.lh.practice.thinking.five;

public class VariadicParameterList20 {
	public static void main(String[] args) {
		f1("ming","hong","hh");
		String[] sArray={"a1","a2","a3"};
		f2(sArray);
		//f2({"wang","er","xiao"});
	}
	static void f1(String... args ){
		for (String s:args){
			System.out.println(s);
		}
	}
	static void f2(String[] args){
		for(String s:args){
			System.out.println(s);
		}
	}
}
