package com.lh.practice.problem;

public class P14 {
	public static void main(String[] args) {
		System.out.println(new P14().maxProductAfterCutting_Dynamic(7));
		System.out.println(new P14().second(8));
	}
	public int maxProductAfterCutting_Dynamic(int length){
		if(length<2) return 0;
		if(length==2) return 1;
		if(length==3) return 2;
		int[] products=new int[length+1];
		products[0]=0;
		products[1]=1;
		products[2]=2;
		products[3]=3;
		int max=0;
		for(int i=4;i<=length;i++){
			max=0;
			for(int j=1;j<=i/2;j++){
				int product=products[j]*products[i-j];
				if(max<product) max=product;
				
			}
			products[i]=max;
		}
		max=products[length];
		return max;
	}
	public int second(int length){
		if(length<2) return 0;
		if(length==2) return 1;
		if(length==3) return 2;
		if(length==4) return 4;
		int ret=1;
		while(length>4){
			ret=ret*3;
			length-=3;
		}
		return ret*length;
	}
}
