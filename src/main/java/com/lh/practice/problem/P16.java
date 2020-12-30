package com.lh.practice.problem;

public class P16 {
	public static void main(String[] args) {
		//int t=5;
		//int t2=t<<31;
		System.out.println(new P16().pow(4.4,-3));
	}
	public double pow(double di,int mi){
		if(di==0) return 0;
		if(mi==0) return 1;
		else if(mi>0){
			return assitPow(di,mi);
		}else{
			return 1/assitPow(di,-mi);
		}
	}
	private double assitPow(double di,int mi){
		double ret=1;
		for(int i=0;i<mi;i++){
			ret=ret*di;
		}
		return ret;
	}
	//递归方法
	public double digui(double di,int mi){
		if(mi==0) return 1;
		if(mi==1) return di;
		double res=digui(di,mi<<1);
		res*=res;
		if(mi<<31!=0){
			res*=di;
		}
		return res;
	}
}
