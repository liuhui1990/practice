package com.lh.practice.pattern.singleton;

public class Review {
	public static void main(String[] args) {
		Slacker1 slacker1=Slacker1.getInstance();
	}
}
class Slacker1{
	private static Slacker1 slacker;
	private Slacker1(){}
	public static Slacker1 getInstance(){
		if(slacker==null){
			slacker=new Slacker1();
		}
		return slacker;
	}
}
class Slacker2{
	private static Slacker2 sla2;
	private Slacker2(){}
	public static synchronized Slacker2 getInstance(){
		if(sla2==null){
			sla2=new Slacker2();
		}
		return sla2;
	}
}
class Hungry{
	private static Hungry hugry=new Hungry();
	public static Hungry getInstance(){
		return hugry;
	}
	private Hungry(){}
}
class StaticIn{
	private StaticIn(){}
	private static class In{
		static final StaticIn staticIn=new StaticIn(); 
	}
	public static StaticIn getInstance(){
		return In.staticIn;
	}
}