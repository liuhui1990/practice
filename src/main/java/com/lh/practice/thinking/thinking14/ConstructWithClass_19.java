package com.lh.practice.thinking.thinking14;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructWithClass_19 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		try{
			Class c=Class.forName("practice.thinking.thinking14.ConstructWithClass_19");
			Constructor ctor=c.getConstructor();
			ConstructWithClass_19 cwc=(ConstructWithClass_19) ctor.newInstance();
			Class<?> con=Class.forName("practice.thinking.thinking14.TypeCounter_12");
			Constructor cont=con.getConstructor();

			TypeCounter_12 cons=(TypeCounter_12) cont.newInstance();
		}catch(ClassNotFoundException e){
			System.out.println("没有找到这个类");
		}
	}
}
class Cons{
}
/*class Son extends Cons{
	Son(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

}*/