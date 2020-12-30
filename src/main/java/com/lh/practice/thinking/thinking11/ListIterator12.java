package com.lh.practice.thinking.thinking11;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class ListIterator12 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList(5);
		l1.add(30);
		l1.add(41);
		l1.add(52);
		l1.add(53);
		//int a=l1.size();3
		List<Integer> l2=new LinkedList();
		l2.add(10);
		l2.add(11);
		l2.add(12);
		l2.add(13);
		ListIterator lit=l1.listIterator(4);
		l2.clear();
		while(lit.hasPrevious()){
			l2.add((Integer) lit.previous());
		}
		System.out.println(l2);
		while(lit.hasNext()){
			System.out.print(lit.next()+" ");
		}
		//l2.clear();
		for(int i=0;i<l1.size();i++){
			l2.set(i, (Integer) lit.previous());
			//lit.hasPrevious();
		}
		System.out.println(l2);
		while(lit.hasNext()){
			System.out.println(lit.nextIndex()+"/"+lit.previousIndex());
			Integer inte=(Integer) lit.next();
			System.out.println(inte+" "+lit.nextIndex());
		}
 	}

}
