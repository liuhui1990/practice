package com.lh.practice.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Review {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Publisher pub=new Publisher();
		Ob1 ob1a=new Ob1(pub);
		Ob1 ob1b=new Ob1(pub);
		Ob2 ob2a=new Ob2(pub);
		pub.setState(233);
	}
}
class Ob1 extends Observer2{
	public Ob1(Publisher pub){
		this.pub=pub;
		pub.attach(this);
	}
	@Override
	public void update() {
		int state=this.pub.getState();
		System.out.println("publisher's state has changed to:"+state);
	}
}
class Ob2 extends Observer2{
	public Ob2(Publisher pub){
		this.pub=pub;
		pub.attach(this);
	}
	@Override
	public void update() {
		System.out.println("the state is:"+this.pub.getState());
		
	}
	
}
class Publisher{
	private int state;
	List<Observer2> list=new ArrayList<Observer2>();
	public void attach(Observer2 obs){
		list.add(obs);
	}
	public void setState(int state){
		this.state=state;
		notifyAllObservers();
	}
	public int getState(){
		return this.state;
	}
	public void notifyAllObservers(){
		for(Observer2 obs:list){
			obs.update();
		}
	}
}
abstract class Observer2{
	protected Publisher pub;
	public abstract void update();
}