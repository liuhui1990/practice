package com.lh.practice.thinking.thinking13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaternMatch_10 {
	public static void main(String[] args) {
		String input = "Java now has regular expressions";
		Pattern p = Pattern.compile("^Java");
		Matcher m = p.matcher(input);
		printMatch("n.w\\s+h(a|i)s");
		printMatch("^Java");
		printMatch("\\Breg.*");
		printMatch("s*");
		printMatch("s{1,3}");
		//printMatch("s*");


		// System.out.println(input.matches("^Java"));
	}

	public static void printMatch(String regex) {
		int pc=0;
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher("Java now has regular expressions");
		while (m.find()) {
			System.out.println(regex+" Match success:" + m.group() + " in "
					+ m.start() + "-" + (m.end()-1));
			pc=1;
		}
		if(pc==0){
			System.out.println(regex+" match failed");
		}
	}
}