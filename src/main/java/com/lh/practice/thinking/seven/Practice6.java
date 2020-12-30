package com.lh.practice.thinking.seven;

public class Practice6 extends father{
	private int arr[];
	private final int leg=arr.length;
	Practice6(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
}
class grand{
	grand(int i){
		System.out.println("grand()");
	}
}
class father extends grand{
	father(){
		super(1);
	}
	father(int i){
		super(i);
		System.out.println("father()");
	}
}