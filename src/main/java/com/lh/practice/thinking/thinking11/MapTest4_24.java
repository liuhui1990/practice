package com.lh.practice.thinking.thinking11;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MapTest4_24 {
	public static void main(String[] args) {
		Map<String, Integer> m1=new LinkedHashMap<String,Integer>();
		for(String s:"a,b,h,L,oh,lan,Hello,Apple,ban,zoo,No".split(",")){
			Random rand=new Random();
			m1.put(s, rand.nextInt(10));
		}
		System.out.println(m1);
		Set<String> kSet=m1.keySet();
		List kList=Arrays.asList(kSet.toArray());
		System.out.println("before practice.sort,keys:"+kSet);
		Collections.sort(kList, String.CASE_INSENSITIVE_ORDER);
		System.out.println("after practice.sort,keys:"+kList);
		Map<String, Integer> m2=new LinkedHashMap();
		for(int i=0;i<kList.size();i++){
			String ks=(String) kList.get(i);
			m2.put(ks, m1.get(ks));
		}
		System.out.println("after practice.sort,map:"+m2);

	}
}
