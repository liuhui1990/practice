package com.lh.practice.problem;

public class P11 {
	@SuppressWarnings("null")
	public static int min(int[] arr){
		if(arr==null||arr.length==0) return (Integer)null;
		if(arr[0]<arr[arr.length-1]) return arr[0];
		int N=arr.length;
		int lo=0;
		int hi=N-1;
		while(lo<hi){
			if((hi-lo)==1){
				return arr[hi];
			}
			int mid=(lo+hi)/2;
			if(arr[lo]<arr[mid]){
				lo=mid;
			}else if(arr[lo]>arr[mid]){
				hi=mid;
			}else{
				return min(arr,lo,hi);
			}
		}
		return (Integer)null;
	}
	/*private int min(int[] arr){
		return 0;
	}*/
	private static int min(int[] arr,int lo,int hi){
		int i=lo+1;
		int last=arr[lo];
		while(i<=hi){
			if(arr[i]<last) return arr[i];
			else last=arr[i++];
		}
		return arr[lo];
	}
	public static void main(String[] args) {
		int[] arr={1,1,1,0,1};
		System.out.println(min(arr));
	}
}
