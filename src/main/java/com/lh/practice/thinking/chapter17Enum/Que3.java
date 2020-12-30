package com.lh.practice.thinking.chapter17Enum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Que3<T> {
	public void print(Que3<?extends List> a){
		System.out.println(a.getClass().getName());
	}
	public static void main(String[] args) {
		Que3<? extends List> q1=new Que3<LinkedList<?>>();
		q1.print(new Que3<ArrayList>() );
	}
}
