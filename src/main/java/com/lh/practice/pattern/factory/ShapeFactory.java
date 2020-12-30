package com.lh.practice.pattern.factory;
/**
 * 普通工厂模式示例
 * @author Administrator
 *
 */
public class ShapeFactory {
	public static Shape getShape(String type){
		Shape shape=null;
		if(type.equalsIgnoreCase("CIRCLE")){
			shape=new Circle();
		}else if (type.equalsIgnoreCase("square")){
			shape=new Square();
		}else{
			return null;
		}
		return shape;
	}
	public static void main(String[] args) {
		Circle c=(Circle) ShapeFactory.getShape("circle");
		c.draw();
	}
}	
interface Shape{
	void draw();
}
class Circle implements Shape{
	public void draw(){
		System.out.println("draw a circle");
	}
}
class Square implements Shape{
	public void draw(){
		System.out.println("draw a Square");
	}
}