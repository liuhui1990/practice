package com.lh.practice.pattern.factory;

public class GenericFactory {
	public static <T> T factory(Class<? extends T> clazz) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		@SuppressWarnings("unchecked")
		T t=(T) Class.forName(clazz.getName()).newInstance();
		return t;
	}
}
