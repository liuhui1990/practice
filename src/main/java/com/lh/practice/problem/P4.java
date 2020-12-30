package com.lh.practice.problem;

public class P4 {
	public static boolean ifExist(int[][] arr,int num){
		if(arr==null||arr.length==0||arr[0].length==0)
			return false;
		int col=arr.length-1;
		int row=arr[0].length-1;
		while(col>=0||row>=0){
			if(arr[col][row]>num){
				col--;
			}else if(arr[col][row]<num){
				row--;
			}else{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] arr={{3},{4}};
		int num=3;
		System.out.println(ifExist(arr,num));
	}
}
