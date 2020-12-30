package com.lh.practice.thinking.thinking9;

public class InterfaceTest {
	static void f1(i1 i){
		i.print();
	}
	public static void main(String[] args) {
		f1(new pp());

	}
}
interface i1{
	void print();
}
class pp implements i1{
	@Override
	public void print(){
		System.out.println("dd");
	}
}