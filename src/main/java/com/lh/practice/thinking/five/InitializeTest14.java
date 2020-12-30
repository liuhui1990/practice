package com.lh.practice.thinking.five;

public class InitializeTest14 {
	public static void main(String[] args) {
		TT tt=new TT();
		String ss=TT.s1;
		System.out.println(ss);
	}
}
class TT{
	static String s1="this s1";
	static String s2;
	static {
		s2="hh s2";
	}
	static void print(){
		System.out.println(s1+"\n"+s2);
	}
}