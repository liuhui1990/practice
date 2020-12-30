package com.lh.practice.thinking.thinking8;

import java.util.ArrayList;
import java.util.List;

public class ImplTest {
	public static void main(String[] args) {
		List<I> li=new ArrayList<I>();
		I s=new S1();
		((S1) s).special();
		li.add(s);
	}
}
interface I{
	void show();
}
class S1 implements I{
	@Override
	public void show() {
		System.out.println("show");
	}
	public void special(){

	}
}
class InTest{
	public  void method(){
		Mid m=new Mid();
		if (true) {

			class In21 {
				private In21(){
					In21 i=new In21();
				}
				void im() {
					System.out.println("局部内部类的方法");
				}
			}
			In21 i = new In21();
		}
	}
	class Mid{

	}
}