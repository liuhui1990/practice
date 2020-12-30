package com.lh.practice.thinking.ten;

public class OverwriteInner extends Out1{
	public class In1 extends Out1.In1{
		public In1(){
			System.out.println("new Out2.In1");
		}
		@Override
		public void In1m(){
			System.out.println("Out2.In1.In1m()");
		}
	}
	public OverwriteInner(){setIn1(new In1());}
	public static void main(String[] args) {
		OverwriteInner ow=new OverwriteInner();
		ow.Out1m();

	}
}
class Out1{
	protected class In1{
		public In1(){
			System.out.println("new Out1.In1");
		}
		public void In1m(){
			System.out.println("Out1.In1.In1m()");
		}
	}
	private In1 in1=new In1();
	public Out1(){
		System.out.println("new Out1");
	}
	public void setIn1(In1 i){
		in1=i;
	}
	public void Out1m(){
		in1.In1m();
	}
}
interface inf{

}
class t1{
	inf getI(){
		return new inf(){

		};
	}
}