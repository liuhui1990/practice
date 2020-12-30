package com.lh.practice.thinking.thinking11;

import java.util.Iterator;

public class IterableTest_31 implements Iterable {

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new Iterator(){
			private String[] words;
			private int index=0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index<words.length;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return words[index++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
			}

		};
	}

}
