package com.lh.practice.thinking.thinking13;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle_3 {
	private final String name;
	private final Formatter f;
	public Turtle_3(String name,Formatter f){
		this.name=name;
		this.f=f;
	}
	public void move(int x,int y){
		f.format("%s the turtle is at(%d,%d)\n", name,x,y);
	}
	public static void main(String[] args) {
		PrintStream outA=System.out;
		Turtle_3 tommy=new Turtle_3("Tommy",new Formatter(outA));
		Turtle_3 terry=new Turtle_3("Terry",new Formatter(System.err));
		tommy.move(0, 0);
		tommy.move(3, 0);
		terry.move(2, 2);
		terry.move(4, 2);
	}
}
