package com.lh.practice.pattern.observer;

import java.util.List;

public abstract class Observer {
	public Observer(Subject sub){
		this.sub=sub;
		this.sub.attach(this);
	}
	public Subject sub;
	public void doSomething(int state){}
}
class O1 extends Observer{
	public O1(Subject sub){
		super(sub);
	}
	@Override
	public void doSomething(int state){
		//do something
	}
}
class O2 extends Observer{
	public O2(Subject sub){
		super(sub);
	}
	@Override
	public void doSomething(int state){
		//do something
	}
}
class Subject{
	private List<Observer> observers;
	private int state;
	public void setState(int state){
		this.state=state;
		notifyAllObs();
	}
	public void getState(){

	}
	public void attach(Observer obs){
		this.observers.add(obs);
	}
	public void notifyAllObs(){
		for(Observer obs:observers){
			obs.doSomething(state);
		}
	}
}