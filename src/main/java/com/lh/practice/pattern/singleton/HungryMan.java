package com.lh.practice.pattern.singleton;
/**
 * 线程安全，但没有实现懒加载
 * @author liuhui
 *
 */
public class HungryMan {
	private HungryMan(){};
	private static HungryMan instance=new HungryMan();
	public static HungryMan getInstance(){
		return instance;
	}
}
