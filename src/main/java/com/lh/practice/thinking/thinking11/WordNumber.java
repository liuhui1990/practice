package com.lh.practice.thinking.thinking11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordNumber<Wc> {
	public static void main(String[] args) {
		String passage="I have 5 apples, How much do you have?";
		String words[]=passage.split("[^a-zA-Z]+");
		Map<String,Integer> counter=new HashMap<String, Integer>();
		for(String word:words){
			int num=counter.get(word)==null?1:counter.get(word)+1;
			counter.put(word, num);
		}
		List<String> wordsList=new ArrayList<String>(counter.keySet());
		List<Integer> frqList=new ArrayList<Integer>(counter.values());

		System.out.println("before practice.sort:"+wordsList);
		Collections.sort(wordsList, String.CASE_INSENSITIVE_ORDER);
		//System.out.println(counter);
		WordNumber wn=new WordNumber();
		Set<?> ws=wn.insert(passage);
		System.out.println(ws.toString());
	}

	Set<W> insert(String passage){
		String wordsArr[]=passage.split("[^a-zA-Z]+");
		Map<String,Integer> counter=new HashMap<String, Integer>();
		for(String word:wordsArr){
			int num=counter.get(word)==null?1:counter.get(word)+1;
			counter.put(word, num);
		}
		Set<String> keys=counter.keySet();
		Collection<Integer> c=counter.values();
		Iterator<Integer> valIt=counter.values().iterator();
		Set<W> wSet=new LinkedHashSet<W>();//此处需要声明wc是属于谁的类：insert或wordnumber
		int i=0;
		for(String k:keys){
			W temp=new W();
			temp.setWord(k);
			temp.setFreq(valIt.next());
			wSet.add(temp);
			i++;
		}
		return wSet;
	}
	class W{
		private String word;
		private int freq;
		public String getWord() {
			return word;
		}
		public void setWord(String word) {
			this.word = word;
		}
		public int getFreq() {
			return freq;
		}
		public void setFreq(int freq) {
			this.freq = freq;
		}
		@Override
		public String toString(){
			return word+": "+freq;
		}
	}
}
