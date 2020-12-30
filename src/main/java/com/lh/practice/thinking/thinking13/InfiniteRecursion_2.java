package com.lh.practice.thinking.thinking13;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion_2 {
	@Override
	public String toString(){
		return " InfiniteRecursion address: "+super.toString()+"\n";
	}
	public static void main(String[] args) {
		List<InfiniteRecursion_2> v=new ArrayList<InfiniteRecursion_2>();
		for(int i=0;i<5;i++){
			v.add(new InfiniteRecursion_2());
		}
		System.out.println(v);
	}
}
