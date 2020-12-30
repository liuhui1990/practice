package com.lh.practice.thinking.thinking11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest_27 {
	public static void main(String[] args) {
		Command c1=new Command("xiaoming");
		Command c2=new Command("xiaohong");
		InCmd ic=new InCmd();
		ic.insert(c1);
		ic.insert(c2);
		UseCmd uc=new UseCmd();
		uc.show(ic.qc);
	}
}
class Command{
	Command(){}
	Command(String name){
		this.name=name;
	}
	private String name;
	public void operation(){
		System.out.println(this.name);
	}
}
class InCmd{
	public Queue<Command> qc=new LinkedList<Command>();
	public Command insert(Command cmd){
		qc.offer(cmd);
		return cmd;
	}
}

class UseCmd {
	public void show(Queue<Command> qc) {
		while(qc.size()>0){
			Command c = new Command();
			c = qc.poll();
			c.operation();
		}
	}
}