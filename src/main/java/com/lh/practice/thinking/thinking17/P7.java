package com.lh.practice.thinking.thinking17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class P7 {
	public static void main(String[] args) {
		List<String> l1 =new ArrayList<String>(Arrays.asList("A b c d s e w q r 5 7".split(" ")));
		LinkedList<String> l2=new LinkedList<String>(l1);
		ListIterator<String> it1=l1.listIterator(l1.size());
		ListIterator<String> it2=l2.listIterator(l2.size());
		//Iterator it=l1.iterator();
		while(it1.hasPrevious()){
			it1.previous();
			it1.previousIndex();
			it1.add(it2.previous());
			it1.previous();
		}
		System.out.println(l1);
	}
}

