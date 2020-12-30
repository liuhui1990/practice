package com.lh.practice.thinking.thinking12;

public class Exception_5 {
	public static void main(String[] args) {
		String words[]=new String[3];
		words="I am LH".split(" ");
		int i=5;
		Exception e=null;
		while(i>-1){
			try {
				System.out.println(words[i]);
				i--;
			} catch (ArrayIndexOutOfBoundsException e2) {
				// TODO: handle exception
				i--;
				e2.printStackTrace();
			}
		}
	}
}
