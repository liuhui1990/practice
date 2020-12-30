package com.lh.practice.thinking.thinking13;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd_13 {
	public static void main(String[] args) {
		String input="I have an apple!";
		String regex="i have";
		Pattern p=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher m=p.matcher(input);
		while(m.find()){
			System.out.println(m.group());
		}
		if(m.lookingAt()){
			System.out.println("lo");
		}
		if(m.matches()){
			System.out.println("m");
		}
		System.out.println(Arrays.toString(input.split(" ",3)));
	}
}
