package com.lh.practice.problem;

public class P17 {
	public static void main(String[] args) {
		new P17().print1ToMaxOfDigits(6);
	}
	public void print1ToMax(int n){
		if(n<=0) return;
		char[] num=new char[n+1];
		for(int i=0;i<10;i++){
			num[0]=(char) ('0'+i);
			prRecu(num,n,0);
		}
	}
	private void prRecu(char[] num,int length,int index){
		if(index==length-1){
			print(num);
			return;
		}
		for(int i=0;i<10;i++){
			num[index+1]=(char) ('0'+i);
			prRecu(num,length,index+1);
		}
	}
	
	public void print1ToMaxOfDigits(int n){
		if(n<=0) return;
		char[] num=new char[n+2];
		for(int i=0;i<num.length;i++){
			num[i]='0';
		}
		num[n+1]='\n';
		while(increment(num,n)){
			print(num);
		}
	}
	private boolean increment(char[] arr,int posi){
		boolean end=true;
		char c=arr[posi];
		if(c!='9') {
			arr[posi]=++c;
		}else{
			arr[posi]='0';
			end=increment(arr,posi-1);
		}
		if(arr[0]!='0') return false;
		return end;
	}
	//注释掉的代码和现有方法运行时间差不多
	private void print(char[] arr){
		boolean b=false;
		//StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++){
			if(b) {
				//sb.append(arr[i]);
				System.out.print(arr[i]);
			}
			else if(arr[i]!='0') {
				b=true;
				//sb.append(arr[i]);
				System.out.print(arr[i]);
			}
		}
		//System.out.print(sb.toString());
	}
}
