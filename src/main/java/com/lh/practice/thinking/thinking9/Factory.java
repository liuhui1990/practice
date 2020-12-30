package com.lh.practice.thinking.thinking9;

public class Factory {
	static void drawCycle(cFactory cf){
		Cycle c=cf.getCycle();
		c.draw();
	}
	public static void main(String[] args) {
		drawCycle(new UniFactory());
		drawCycle(new BiFactory());
	}
}
interface Cycle{
	void draw();
}
interface cFactory{
	Cycle getCycle();
}
class Unicycle implements Cycle{
	@Override
	public void draw(){
		System.out.println("draw Unicycle");
	}
}
class Bicycle implements Cycle{
	@Override
	public
	void draw(){
		System.out.println("draw Bicycle");
	}
}
class Tricycle implements Cycle{
	@Override
	public
	void draw(){
		System.out.println("draw Tricycle");
	}
}
class UniFactory implements cFactory{
	@Override
	public
	Unicycle getCycle(){
		return new Unicycle();
	}
}
class TriFactory implements cFactory{
	@Override
	public
	Tricycle getCycle(){
		return new Tricycle();
	}
}
class BiFactory implements cFactory{
	@Override
	public
	Bicycle getCycle(){
		return new Bicycle();
	}
}