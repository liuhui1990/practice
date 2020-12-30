package com.lh.practice.thinking.thinking17;

import java.util.LinkedList;

public class P8 {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();

	}
	
}
class SList<T>{
	private SListIterator sli;
	public String toString(){
		return null;
	}
	public SListIterator iterator(){
		return new SListIterator(){
			private int index;
			/*public Link next(){
				return 
			}*/
		};
	}
}
class SListIterator{
	private void a(){
		int[] a;
	}
}
class  Link<T>{
	private Link<T> next;
	private T t;
	public Link<T> next(){
		return this.next;
	}
	public T get(){
		return this.t;
	}
	public void set(T t){
		this.t=t;
	}
}