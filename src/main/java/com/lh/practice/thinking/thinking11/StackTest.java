package com.lh.practice.thinking.thinking11;

import java.util.LinkedList;

public class StackTest {
	public static void main(String[] args) {
		Stacke<String> stk=new Stacke<String>();
		stk.push("U");
		stk.push("n");
		stk.push("c");
		stk.popAndPrint(3);
		stk.push("e");
		stk.push("r");
		stk.push("t");
		stk.popAndPrint(3);
		stk.push("a");
		stk.popAndPrint(1);
		stk.push("i");
		stk.popAndPrint(1);
		stk.push("n");
		stk.push("t");
		stk.push("y");
		stk.popAndPrint(3);
		stk.push(" ");
		stk.popAndPrint(1);
		stk.push("r");
		stk.push("u");
		stk.popAndPrint(2);
		stk.push("l");
		stk.push("e");
		stk.push("s");
		stk.popAndPrint(3);
	}


}
class Stacke<T>{
	private final LinkedList<T> l=new LinkedList<T>();
	public void push(T a){
		this.l.add(a);
	}
	public T pop(){
		return l.removeLast();
	}
	public T pop(int time){
		for(int i=0;i<time-1;i++){
			l.removeLast();
		}
		return l.removeLast();
	}
	public void popAndPrint(int number){
		//System.out.println();
		for(int i=0;i<number;i++){
			System.out.print(l.removeLast()+" ");
		}
	}
	public T peek(){
		return l.getFirst();
	}
	public boolean isEmpty(){
		return l.isEmpty();
	}
}