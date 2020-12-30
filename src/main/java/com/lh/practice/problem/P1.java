package com.lh.practice.problem;
/**
 * 实现单例模式
 * @author Administrator
 *
 */
public class P1 {

}
class S1{
	private  static volatile S1 s1;
	private S1(){}
	public static synchronized S1 getInstance(){
		if(s1==null){
			synchronized(S1.class){
				s1=new S1();
			}
		}
		return s1;
	}
}
class S2{
	private static class Holder{
		private static final S2 instance=new S2();
	}
	private S2(){
		
	}
	public static S2 getInstance(){
		return Holder.instance;
	}
}