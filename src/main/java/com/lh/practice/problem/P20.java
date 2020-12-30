package com.lh.practice.problem;

public class P20 {
	public static void main(String[] args) {
		String num="-0.0033e10";
		System.out.println(new P20().isNum(num));
		System.out.println(new P20().isNumeric(num));
	}
	public boolean isNum(String number){
		if(number==null||number.length()==0) return false;
		char[] num=number.toCharArray();
		int length=num.length;
		int index=0;
		int start=0;
		if(num[index]=='+'||num[index]=='-'){
			index++;
			start++;
			//开头有0视为不是数值
			if(num[start]=='0'&&start<length-1&&num[start+1]!='.'){
				return false;
			}
			while(index<length&&isInt(num[index])){
				index++;
			}
			if(index==start) return false;
		}else{
			if(num[start]=='0'&&start<length-1&&num[start+1]!='.'){
				return false;
			}
			while(index<length&&isInt(num[index])){
				index++;
			}
		}
		if(index<length){
			//判断小数部分
			if(num[index]=='.'){
				index++;
				while(index<length&&isInt(num[index])){
					index++;
				}
			}
			//判断e及后面的部分
			if(index<length){
				if(num[index]=='e'||num[index]=='E'){
					index++;
					if(index==length) return false;
					start=index;
					if(num[index]=='+'||num[index]=='-'){
						index++;
						start++;
						if(index==length) return false;
						//开头有0视为不是数值
						if(num[start]=='0'){
							return false;
						}
						while(index<length&&isInt(num[index])){
							index++;
						}
						if(index==start) return false;
						if(index==length) return true;
						else return false;
					}else{
						if(num[start]=='0'){
							return false;
						}
						while(index<length&&isInt(num[index])){
							index++;
						}
					}
				}else{
					return false;
				}
			}
		}else{
			return true;
		}
		return true;
	}
	private boolean isInt(char c){
		int res=c-'0';
		if(res>=0&&res<=9) return true;
		return false;
	}
	//这是书上的方法：
	public boolean isNumeric(String num){
		if(num==null||num.length()==0) return false;
		char[] str=num.toCharArray();
		int index=0;
		index=scanInteger(str,index);
		if(index==0) return false;
		if(str[index]=='.'){
			index++;
			int sign=index;
			index=scanUnsignedInteger(str,index);
			if(index==sign) return false;
		}
		if(str[index]=='e'||str[index]=='E'){
			index++;
			int sign=index;
			index=scanInteger(str,index);
			if(index==sign) return false;
		}
		return true;
	}
	private int scanInteger(char[] str,int index){
		int length=str.length;
		if(index==length) return index;
		if(str[index]=='+'||str[index]=='-') index++;
		return scanUnsignedInteger(str,index);
	}
	private int scanUnsignedInteger(char[] str,int index){
		while(index<str.length&&str[index]-'0'>=0&&str[index]-'0'<=9){
			index++;
		}
		return index;
	}
}
