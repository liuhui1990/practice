package com.lh.practice.problem;

public class P5 {
	public static String replaceAll(String input){
		if(input==null||input.length()==0){
			return input;
		}
		StringBuilder sb=new StringBuilder();
		for(char c:input.toCharArray()){
			if(c==' '){
				sb.append("%20");
			}else{
				sb.append(c);
			}
		}
		System.out.println(sb);
		return sb.toString();
	}
	public static void main(String[] args) {
		String input=null;
		replaceAll(input);
		//input.replaceAll(regex, replacement);
	}
}
