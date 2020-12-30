package com.lh.practice.thinking.thinking14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegisteredFactory_14 {

}
class part{
	@Override
	public String toString(){
		return this.getClass().getSimpleName();
	}
	static List<IFactory<? extends part>> partFactory=new ArrayList<IFactory<? extends part>>();
	static{
		partFactory.add(new Filter.Factory());
	}
	private static Random rand=new Random(47);
	public static part randPart(){
		int n=rand.nextInt(partFactory.size());
		return partFactory.get(n).creat();
	}
}
class Filter extends part{
	public static class Factory implements IFactory<Filter>{
		@Override
		public Filter creat() {
			return new Filter();
		}
	}
}
interface IFactory<T>{
	T creat();
}