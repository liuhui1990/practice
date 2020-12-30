package com.lh.practice.thinking.ten;

public class NestedClass18 {
	public static void main(String[] args) {
		Parcel.NestedC.print();

	}
}
class Parcel{
	static class NestedC{
		static class Inner{
			static void inprint(){
				System.out.println("最里面的");
			}
		}
		public static void print(){
			System.out.println("静态方法");
		}
		public void p2(){
			System.out.println("非静态方法");
		}
	}
	class normal{
		class norInner{
		}
	}
}