package com.lh.practice.thinking.thinking11;

import java.util.LinkedList;
import java.util.ListIterator;



public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.addLast(14);
		list.addFirst(10);
		ListIterator<Integer> lit=list.listIterator();
		//lit.set(9);
		lit.add(9);
		while(lit.hasPrevious()){
			lit.previous();
		}
		System.out.println(lit);
		list.set(3, 3);
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
	}
}
