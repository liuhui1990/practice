package com.lh.practice.thinking.ten;


public class MultInner23 {
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		A a3=new A();
		B b=new B();
		b.setAri(A.getU(), 0);
		b.setAri(a2.getU(), 1);
		b.useAr();
		b.nullAr();
	}
}
interface U{
	void mthod1();
	void m2();
	void m3();
}
class A{
	 static class ua implements U{
		private ua(){

		}
		@Override
		public void mthod1() {
			// TODO Auto-generated method stub
		}
		@Override
		public void m2() {
			// TODO Auto-generated method stub
		}
		@Override
		public void m3() {
			// TODO Auto-generated method stub
		}
	}
	static U getU(){
		return new ua();
	}
}
class B{
	private final U[] ar=new U[3];
	void setAr(U[] ua){
		int i=0;
		for(U u:ua){
			ar[i]=u;
		}
	}
	void setAri(U u,int i){
		ar[i]=u;
	}
	void nullAr(){
		for(int i=0;i<3;i++){
			this.ar[i]=null;
		}
	}
	void useAr(){
		for(int i=0;i<ar.length;i++){
			ar[i].mthod1();
			ar[i].m2();
			ar[i].m3();
		}
	}
}