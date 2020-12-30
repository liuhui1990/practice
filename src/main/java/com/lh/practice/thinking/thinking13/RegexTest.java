package com.lh.practice.thinking.thinking13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String[] args) {
		String input="abcc,abcabc,abcdef";
		Pattern p=Pattern.compile("(abc){3,}");
		Matcher m=p.matcher(input);
		while(m.find()){
			System.out.println(m.group());
		}
	}
}
