package com.lh.practice.pattern.singleton;

import java.util.Random;
/**
 * 懒汉式，线程安全
 * @author liuhui
 *
 */
public class SlackerThreadSafe {
	private SlackerThreadSafe(){
		System.out.println("SlackerThreadSafe has been initialized");
		System.out.println(new Random().nextInt(100));
	}
	private static  SlackerThreadSafe instance;
	public static synchronized SlackerThreadSafe getInstance(){
		if(instance==null){
			instance=new SlackerThreadSafe();
		}
		return instance;
	}
	public static void main(String[] args) {
		SlackerThreadSafe st=SlackerThreadSafe.getInstance();
		SlackerThreadSafe st2=SlackerThreadSafe.getInstance();
		SlackerThreadSafe st3=SlackerThreadSafe.getInstance();
	}
}
