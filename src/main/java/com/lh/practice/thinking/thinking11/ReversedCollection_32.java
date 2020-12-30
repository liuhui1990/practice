package com.lh.practice.thinking.thinking11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class StringSeq{
	protected String[] letters="I have an apple".split(" ");
}
public class ReversedCollection_32 extends StringSeq{
	public static void main(String[] args) {
		ReversedCollection_32 rc=new ReversedCollection_32();
		for(String s:rc.reversed()){
			System.out.print(s+" ");
		}
	}
	public Iterable<String> randomized(){
		return new Iterable<String>(){

			@Override
			public Iterator<String> iterator() {
				List l=new ArrayList(Arrays.asList(letters));
				Collections.shuffle(l);
				return l.iterator();
			}
		};
	}
	public Iterable<String> reversed(){
		return new Iterable<String>(){
			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<String>(){
					private int index=letters.length-1;
					@Override
					public boolean hasNext(){
						return index>-1;
					}

					@Override
					public String next() {
						return letters[index--];
					}

					@Override
					public void remove() {
						// TODO Auto-generated method stub
					}
				};
			}

		};
	}
	public Iterator<String> iterator(){
		return new Iterator<String>(){
			private int index=0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index>letters.length;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return letters[index++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
			}
		};
	}
}
