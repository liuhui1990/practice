package com.lh.practice.pattern.factory;

public abstract class AbstractFactory {
	public abstract Shape2 getShape(String shape);
	public abstract Color getColor(String color);
	public static void main(String[] args) {
		AbstractFactory factory=new Factory();
		Color red=factory.getColor("red");
		red.fill();
	}
}
class Factory extends AbstractFactory{
	public  Shape2 getShape(String shape){
		if(shape==null){
			return null;
		}
		if(shape.equalsIgnoreCase("circle")){
			return new Circle2();
		}
		if(shape.equalsIgnoreCase("square")){
			return new Square2();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		if(color==null){
			return null;
		}
		if(color.equalsIgnoreCase("green")){
			return new Red();
		}
		if(color.equalsIgnoreCase("red")){
			return new Green();
		}
		return null;
	}
	
}
interface Shape2{
	void draw();
}
class Circle2 implements Shape2{
	public void draw(){
		System.out.println("draw a circle");
	}
}
class Square2 implements Shape2{
	public void draw(){
		System.out.println("draw a square");
	}
}
interface Color{
	void fill();
}
class Red implements Color{
	public void fill(){
		System.out.println("fill with red");
	}
}
class Green implements Color{
	public void fill(){
		System.out.println("fill with green");
	}
}