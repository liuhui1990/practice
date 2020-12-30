package com.lh.practice.thinking.thinking14;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.lh.practice.tools.pets.Pet;

public class TypeCounter_12 extends HashMap<Object,Integer >{
	public void count(Object obj){
		Integer number=get(obj);
		put(obj,number==null?1:number+1);
	}
	@Override
	public String toString(){
		StringBuilder sb=new StringBuilder();
		for(Entry<Object,Integer> pair:entrySet()){
			sb.append(pair.getKey());
			sb.append("=");
			sb.append(pair.getValue());
			sb.append("\n");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		TypeCounter_12 tc=new TypeCounter_12();
		String[] sa={"hh","hh","tt"};
		int[] ia={1,2,3,4};
		boolean[] ba={true,true};
		for(String s:sa){
			tc.count(s);
		}
		for(int i:ia){
			tc.count(i);
		}
		for(boolean b:ba){
			tc.count(b);
		}
		System.out.println(tc);
		Counter2 c2=new Counter2(Object.class);
		for(String s:sa){
			c2.count(s);
		}
		for(int i:ia){
			c2.count(i);
		}
		for(boolean b:ba){
			c2.count(b);
		}
		System.out.println(c2);
		System.out.println("pet count begin:");
		Counter2 petCount=new Counter2(Pet.class);
		List<Pet> petsList=Pet.petsList(13);
		for(Pet p:petsList){
			petCount.count(p);
		}
		System.out.println(petCount);
	}
}
class Counter2 extends HashMap<Class<?>,Integer>{
	private final Class<?> baseType;
	public Counter2(Class<?> baseType){
		this.baseType=baseType;
	}
	public void count(Object obj){
		Class type=obj.getClass();
		if(!baseType.isAssignableFrom(type)){
			throw new RuntimeException(obj+" is not a"+baseType);
		}
		countClass(type);
	}
	private void countClass(Class<?> type){
		Integer num=get(type);
		put(type,num==null?1:num+1);
		Class superClass=type.getSuperclass();
		if(superClass!=null&&baseType.isAssignableFrom(superClass)){
			countClass(superClass);
		}
	}
	@Override
	public String toString(){
		Class c="hh".getClass();
		try {
			Method  m=c.getDeclaredMethod("toString");
			m.setAccessible(true);

		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuilder result=new StringBuilder("{");
		for(Entry<Class<?>, Integer> pair:entrySet()){
			result.append(pair.getKey().getSimpleName());
			result.append("=");
			result.append(pair.getValue());
			result.append("\n");
		}
		return result.toString();
	}
}