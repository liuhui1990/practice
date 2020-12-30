package com.lh.practice.thinking.chapter14JiHeLei;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Que3 {
	private final int id;
	private final String name;

	public String getName() {
		return name;
	}
	public int getId(){
		return id;
	}
	public Que3(int i, String string) {
		this.id=i;
		this.name=string;
	}
	public static void main(String[] args) throws CloneNotSupportedException{
		Map<Integer,String> map=new HashMap<Integer, String>();
		Que3 q1=new Que3(1,"xiaoming");
		Que3 q2=new Que3(3,"xiaoming");
		Que3 q3=new Que3(4,"xiaoming");
		Que3 q4=new Que3(15,"xiao");
		Que3 q5=new Que3(5,"ming");

		map.put(q1.getId(), q1.getName());
		map.put(q2.getId(), q2.getName());
		map.put(q3.getId(), q3.getName());
		map.put(q4.getId(), q4.getName());
		map.put(q5.getId(), q5.getName());
		System.out.println(map);
		map.remove(015);

		showMap(map);


	}
	public static void showMap(Map<Integer,String> map){
		Set<Integer> set=map.keySet();
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()){
			Integer id=it.next();
			String name=map.get(id);
			System.out.println(id+"-"+name);
		}
	}
}