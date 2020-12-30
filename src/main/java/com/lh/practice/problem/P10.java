package com.lh.practice.problem;

public class P10 {
	public static int fibn(int n){
		if(n<=0) return 0;
		else if(n==1) return 1;
		int fn_2=0;
		int fn_1=1;
		//int fn;
		for(int i=2;i<n;i++){
			int temp=fn_2+fn_1;
			fn_2=fn_1;
			fn_1=temp;
		}
		return fn_2+fn_1;
	}
	public static void main(String[] args) {
		System.out.println(fibn(8));
	}
}
