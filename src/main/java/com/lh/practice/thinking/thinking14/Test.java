package com.lh.practice.thinking.thinking14;

public class Test {
	public static <T> T factory(Class<? extends T> clazz) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		@SuppressWarnings("unchecked")
		T t=(T) Class.forName(clazz.getName()).newInstance();
		return t;
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		apple ap=factory(apple.class);
		fruit f=factory(fruit.class);
		f.toString();
		ap.eatApple();
	}
}
class fruit{}
class apple extends fruit{
	public void eatApple(){
		System.out.println("apple");
	}
}
class banana extends fruit{
	public void eatBanana(){
		System.out.println("banana");
	}
}
