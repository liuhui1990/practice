package com.lh.practice.thinking.thinking12;

public class TWODArray {
	public static void main(String[] args) {
		String arr[][]=new String[10][2];
		for(int j=0;j<2;j++){
			for(int i=0;i<arr.length;i++){
				arr[i][j]=""+i+j+"";
			}
		}
		System.out.println(arr.length);
		System.out.println(arr[2]);
	}
}
