package com.lh.practice.thinking.thinking11;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MapTest2_18 {
	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<Integer,String>();
		m.put(4, "one");
		m.put(2, "two");
		m.put(3, "three");
		System.out.println(m);
		Map<Integer,String> linkhsm=new LinkedHashMap<Integer, String>(m);
		System.out.println(linkhsm);
		Set hs=new HashSet();
		hs.add(1);
		hs.add(3);
		hs.add(2);
		System.out.println(hs);
		Set lhs=new LinkedHashSet();
		Collections.addAll(lhs, "a,r,c,A,E".split(","));
		Collections.addAll(hs, "a,r,c,A,E".split(","));
		System.out.println(lhs);
		System.out.println(hs);
	}
}