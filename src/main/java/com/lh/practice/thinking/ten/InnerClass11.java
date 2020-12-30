package com.lh.practice.thinking.ten;

public class InnerClass11 {
	public class Rabbit implements IEat{
		@Override
		public void swollow(){
			System.out.println("s");
		}
	}
	public Rabbit getRab(){
		return new Rabbit();
	}
	public void intputRab(Rabbit rab){
		rab.swollow();
	}
}
interface IEat{
	void swollow();
}
class rat implements IEat{
	@Override
	public
	void swollow(){
		System.out.println("rat swollow");
	}
}
class run{
	public static void sw(IEat ie){
		ie.swollow();
	}
	public static void ratSw(rat r){
		r.swollow();
	}
	public static void main(String[] args) {
		InnerClass11 ic11=new InnerClass11();
		sw(ic11.getRab());
		IEat irab=ic11.getRab();
		ic11.intputRab(ic11.getRab());
		IEat irat=new rat();
		ratSw((rat)irat);
		//ratsw(irat);
		//ic11.intputRab(i);
	}
}