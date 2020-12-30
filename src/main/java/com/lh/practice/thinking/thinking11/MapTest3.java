package com.lh.practice.thinking.thinking11;

import java.util.HashMap;
import java.util.Map;

public class MapTest3 {
	public static void main(String[] args) {
		String words="A,B,c,d,add,apple,element,count,America,China,hello,grand,what,bad,language,rant,tank,bank,mom,Daddy,J,L,No,no";
		char[] charArr=words.toCharArray();
		Map<Character,Integer> charMap=new HashMap<Character,Integer>();
		for(char ch:charArr){
			int number=charMap.get(ch)==null?1:charMap.get(ch)+1;
			charMap.put(ch, number);
		}
		System.out.println(charMap.get("a".charAt(0)));
		System.out.println(charMap);
		Map<Character,Integer> vowels=new HashMap<Character,Integer>();
		vowels.put("a".charAt(0), charMap.get("a".charAt(0))==null?0:charMap.get("a".charAt(0))+(charMap.get("A".charAt(0))==null?0:charMap.get("A".charAt(0))));
		vowels.put("e".charAt(0), charMap.get("e".charAt(0))==null?0:charMap.get("e".charAt(0))+(charMap.get("E".charAt(0))==null?0:charMap.get("E".charAt(0))));
		vowels.put("i".charAt(0), charMap.get("i".charAt(0))==null?0:charMap.get("i".charAt(0))+(charMap.get("I".charAt(0))==null?0:charMap.get("I".charAt(0))));
		vowels.put("o".charAt(0), charMap.get("o".charAt(0))==null?0:charMap.get("o".charAt(0))+(charMap.get("O".charAt(0))==null?0:charMap.get("O".charAt(0))));
		vowels.put("u".charAt(0), charMap.get("u".charAt(0))==null?0:charMap.get("u".charAt(0))+(charMap.get("U".charAt(0))==null?0:charMap.get("U".charAt(0))));
		//vowels.put("a".charAt(0), charMap.get("a")+charMap.get("A"));
		System.out.println(vowels);

	}

}
