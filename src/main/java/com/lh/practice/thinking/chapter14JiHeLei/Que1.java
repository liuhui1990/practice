package com.lh.practice.thinking.chapter14JiHeLei;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Que1 {
	public static void main(String[] args){
		List<String> list=new LinkedList<String>();
		for (int i=1;i<=100;i++){
//			String s=(String)i;
			list.add(""+i+"");
		}
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String temp= it.next();
			System.out.print(temp+" ");
		}
		list.remove(10);

		System.out.println("\n�Ƴ�����Ϊ��");
		System.out.println(list);
//		Iterator<String> it2=list.iterator();
//		while(it2.hasNext()){
//			String temp= it.next();
//			System.out.print(temp+" ");
//		}

	}

}
