package com.lh.practice.thinking.thinking13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups_12 {
	public static void main(String[] args) {
		String poem="I have an apple.\n"+
				"Tom was in the mirror\n"+
				"What a beautiful day\n"+
				"not  bad";
		Matcher m=Pattern.compile("(\\W([a-z]+))").matcher(poem);
		int i=1;
		while(m.find()){
			System.out.print("["+i+":"+m.group()+"] ");
			i++;
		}
	}
}
