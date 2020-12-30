package com.lh.practice.thinking.ten;

public class AnInFactory16 {
	public static void drawCycle(CycleFactory cycfac){
		Cycle c=cycfac.getCycle();
		c.draw();
	}
	public static void main(String[] args) {
		drawCycle(Tricycle.factory);
		drawCycle(Bicycle.factory);
	}
}
interface Cycle{
	void draw();
}
interface CycleFactory{
	Cycle getCycle();
}
class Bicycle implements Cycle{
	private Bicycle(){}
	@Override
	public void draw(){
		System.out.println("draw a Bicycle");
	}
	public static CycleFactory factory=new CycleFactory(){
		@Override
		public Cycle getCycle(){
			return new Bicycle();
		}
	};
}
class Tricycle implements Cycle{
	private Tricycle(){}
	@Override
	public void draw(){
		System.out.println("draw a Tricycle");
	}
	public static CycleFactory factory=new CycleFactory(){
		@Override
		public Cycle getCycle(){
			return new Tricycle();
		}
	};
}