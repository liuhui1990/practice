package com.lh.practice.thinking.thinking12;

public class TryCatchTest {
	public static void main(String[] args) {
		String arr[]="I have an apple".split(" ");
		try{
			//biao:
			String fo=arr[5];
		}catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("out of bounds");
			throw aie;

		}
	}
}
