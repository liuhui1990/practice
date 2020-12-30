package com.lh.practice.thinking.thinking11;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapTest1why {
	public static void main(String[] args) {
		Gerbil g1=new Gerbil(1,"beta");
		Gerbil g2=new Gerbil(2,"jerry");
		Gerbil g3=new Gerbil(3,"shuke");
		Map<String,Gerbil> gerbils=new TreeMap<String,Gerbil>();
		gerbils.put(g1.getName(), g1);
		gerbils.put(g2.getName(), g2);
		gerbils.put(g3.getName(), g3);
		Iterator<String> it=gerbils.keySet().iterator();
		while(it.hasNext()){
			String name=it.next();
			System.out.println(name);
			gerbils.get(name).hop();
		}
	}
}

class Gerbil{
	private final int gnumber;
	private String name;
	Gerbil(int gn,String name){
		gnumber=gn;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void hop(){
		System.out.println("number "+gnumber+" gerbil,"+name+" is hopping");
	}
}