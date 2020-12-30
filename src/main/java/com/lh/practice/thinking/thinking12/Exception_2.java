package com.lh.practice.thinking.thinking12;

public class Exception_2 {
	public static void main(String[] args) {
		Cat cat=new Cat();
		cat=null;
		String words[]=new String[3];
		System.out.println(words.length);
		words="I am Tom .".split(" ");
		System.out.println(words.length);
		try {
			for(int i=0;i<5;i++){
				System.out.println(words[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
class Cat{
	public void gululu(){
		System.out.println("gugluglu");
	}
}