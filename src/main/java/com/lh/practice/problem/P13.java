package com.lh.practice.problem;
//这道题也需要用回溯法？直接遍历不就行了？
public class P13 {
	public int points(int m,int n,int k){
		if((Integer)m==null||(Integer)n==null||(Integer)k==null||m==0||n==0||k==0){
			return 0;
		}
		int ret=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(allow(i,j,k)) ret++;
			}
		}
		return ret;
	}
	private boolean allow(int i,int j,int k){
		if((sum(i)+sum(j))<=k){
			return true;
		}
		return false;
	}
	private int sum(int num){
		int ret=0;
		while(num>0){
			ret+=num%10;
			num=num/10;
		}
		return ret;
	}
	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println(new P13().points((Integer)null, 2,1));
	}
}
