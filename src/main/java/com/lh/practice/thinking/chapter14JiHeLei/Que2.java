package com.lh.practice.thinking.chapter14JiHeLei;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Que2 {
	public static void main(String[] arga){
		Set tset=new TreeSet<Object>();
		tset.add("A");
		tset.add("a");
		tset.add("c");
		tset.add("C");
		tset.add("a");
		String[] arr={"A","a","c","C","a"};
		showArray(arr);
		System.out.println(tset);
		List list=new ArrayList<Object>();
		add(list,arr);
		System.out.println(list);
		int size=list.size();
		int length=arr.length;
	}
	public static void showArray(String[] arr1){
		for(int i=0;i<arr1.length;i++){
			if(i==arr1.length-1){
				System.out.println(arr1[i]+" ");
			}else{
				System.out.print(arr1[i]+" ");
			}
		}

	}
	private static void add(Collection c,String[] arr){
		for(int i=0;i<arr.length;i++){
			c.add(arr[i]);
		}
	}

}
