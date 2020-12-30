package com.lh.practice.thinking.thinking11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class IteratorTest8 {
	public static void display(Iterator it){
		//System.out.println(it.toString());
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Collection<String> al=new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		display(al.iterator());
		LinkedList<String> ll=new LinkedList<String>(al);
		HashSet hs=new HashSet(al);
		TreeSet ts=new TreeSet(al);
		display(ll.iterator());
		display(hs.iterator());
		display(ts.iterator());

	}
}
