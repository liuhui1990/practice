package com.lh.practice.problem;

import java.util.Arrays;

public class P21 {
	public static void main(String[] args) {
		int[] arr=new int[]{0};
		new P21().sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public void sort(int[] arr){
		if(arr==null||arr.length==0) return;
		int length=arr.length;
		int lf=-1;
		int rg=length;
		while(true){
			while(lf<length-1&&isJishu(arr[++lf])){}
			while(rg>0&&!isJishu(arr[--rg])){}
			if(lf>=rg) break;
			exch(arr,lf,rg);
		}
	}
	private void exch(int[] arr,int a,int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	private boolean isJishu(int i){
		if(i<<31!=0) return true;
		return false;
	}
}
