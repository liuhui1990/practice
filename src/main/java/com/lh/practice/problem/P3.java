package com.lh.practice.problem;

public class P3 {
	public static int duplicate(int[] arr){
		int i=0;
		while(i<arr.length){
			if(arr[i]==i){
				i++;
			}else if(arr[i]>i){
				if(arr[i]==arr[arr[i]]) {
					System.out.println(arr[i]);
					return arr[i];
				}
				exch(arr,i,arr[i]);
			}else{
				System.out.println(arr[i]);
				return arr[i];
			}
		}
		System.out.println("-1");
		return -1;
	}
	private static void exch(int[] arr,int a,int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void main(String[] args) {
		int[] arr={3,2,1,5,2,6,7,0,8,4};
		/*Timer.start();
		duplicate(arr);
		Timer.end();*/
		new P3_2().du(arr);
	}
}
//现在的解答无法工作，我看不懂书上的示例
class P3_2{
	public int du(int[] arr){
		int length=arr.length;
		int lo=1;
		int hi=length-1;
		while(hi>=lo){
			int mid=(hi+lo)/2;
			int times=showTimes(arr,lo,mid);
			if(lo==hi){
				if(times>1){
					System.out.println(arr[lo]);
					return arr[lo];
				}else{
					break;
				}
			}
			
			if(times>(mid-lo+1)){
				hi=mid;
			}else{
				lo=mid+1;
			}
		}
		System.out.println("-1");
		return -1;
	}
	private int showTimes(int[] arr,int lo,int hi){
		int times=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=hi&&arr[i]>=lo){
				times++;
			}
		}
		return times;
	}
}