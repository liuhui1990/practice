package com.lh.practice.tools.generator;

public class BasicGenerator<T> implements Generator<T>{
	private final Class<T> type;
	public BasicGenerator(Class<T> type){
		this.type=type;
	}

	@Override
	/**
	 * 要调用此方法必须满足：1.T是公有（public）类；2.T具有无参默认构造器
	 */
	public T next() {
		try {
			return type.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static <T> BasicGenerator<T> create(Class<T> type){
		return new BasicGenerator<T>(type);
	}

}
