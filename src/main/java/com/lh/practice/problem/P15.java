package com.lh.practice.problem;

public class P15 {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(5^Integer.MAX_VALUE));
		System.out.println(new P15().numberOfOne_1(5));
	}
	public int numberOfOne_1(int input){
		String binaryString=Integer.toBinaryString(input);
		char[] arr=binaryString.toCharArray();
		int count=0;
		for(char c:arr){
			if(c=='1') count++;
		}
		return count;
	}
	public int numberOfOne_2(int input){
		int count=0;
		while(input!=0){
			count++;
			input=input&(input-1);
		}
		return count;
	}
	
}
