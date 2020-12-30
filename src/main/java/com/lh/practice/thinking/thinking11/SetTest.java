package com.lh.practice.thinking.thinking11;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		Collections
				.addAll(words,
						"A,B,c,d,add,apple,element,count,America,China,hello,grand,what,bad,language,rant,tank,bank,mom,Daddy,J,L,No,no"
								.split(","));
		System.out.println(words);
		vowel(words);
	}
	/**
	 *
	 * @param words
	 */
	static void vowel(Set<String> words){
		Iterator<String> it=words.iterator();
		int count=0;
		while(it.hasNext()){
			String word=it.next();
			int singleNum=vowelInOneWord(word);
			count+=singleNum;
			String vow=singleNum>1?"vowels":"vowel";
			System.out.println(word+" has "+singleNum+" "+vow+"!");
		}
		System.out.println("the set has "+count+" vowels in total.");
	}
	static int vowelInOneWord(String word){
		int count=0;
		char ch[]=word.toCharArray();
		for(char c:ch){
			String s=String.valueOf(c);
			s=s.toLowerCase();
			if(s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u")){
				count++;
			}
		}
		return count;
	}

}
