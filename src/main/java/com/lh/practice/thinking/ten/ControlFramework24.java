package com.lh.practice.thinking.ten;

import java.util.ArrayList;
import java.util.List;
public class ControlFramework24 {
	public static void main(String[] args) {
		GreenControls gc=new GreenControls();
		gc.addEvent(gc.new openFan(200));
		gc.addEvent(gc.new closeFan(400));
		gc.run();
	}
}
abstract class Event{
	private long eventTime;
	protected long delayTime;
	public Event(long delt){
		this.delayTime=delt;
		start();
	}
	public void start(){
		eventTime=System.nanoTime()+delayTime;
	}
	public boolean ready(){
		return System.nanoTime()>=eventTime;
	}
	public abstract void action();
}
class Controller{
	List<Event> eventList=new ArrayList<Event>();
	public void addEvent(Event e){
		eventList.add(e);
	}
	public void run(){
		while(eventList.size()>0){
			for(Event e:eventList){
				if(e.ready()){
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
			}
		}
	}
}
class GreenControls extends Controller{
	boolean fan=false;
	public class openFan extends Event{
		public openFan(long delt) {
			super(delt);
			// TODO Auto-generated constructor stub
		}
		@Override
		public void action(){
			GreenControls.this.fan=true;
		}
		@Override
		public String toString(){
			return "fan has been opened!";
		}
	}
	public class closeFan extends Event{
		public closeFan(long delt) {
			super(delt);
			// TODO Auto-generated constructor stub
		}
		@Override
		public void action(){
			GreenControls.this.fan=false;
		}
		@Override
		public String toString(){
			return "fan has been closed!";
		}
	}
}