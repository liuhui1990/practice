package com.lh.practice.thinking.thinking12;

public class RuntimeException_27 {
	public static void main(String[] args) {
		String arr[]="I have an apple".split(" ");

		try{
			String fo=arr[5];
		}catch(ArrayIndexOutOfBoundsException ae){
			throw ae;
		}catch(RuntimeException re){
			try {
				throw re.getCause();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
