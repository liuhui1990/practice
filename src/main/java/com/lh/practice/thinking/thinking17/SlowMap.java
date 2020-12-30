package com.lh.practice.thinking.thinking17;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SlowMap<K,V> extends AbstractMap<K,V> {
	private List<K> keys=new ArrayList<K>();
	private List<V> values=new ArrayList<V>();
	public V put(K key,V value){
		if(keys.contains(key)){
			int index=keys.indexOf(key);
			V oldValue=values.get(index);
			values.set(index, value);
			return oldValue;
		}else{
			keys.add(key);
			values.add(value);
			return null;
		}
	}
	public V get(Object key){
		return values.get(keys.indexOf(key));
	}
	@Override
	public Set<Entry<K, V>> entrySet() {
		Set<Entry<K, V>> set=new HashSet<Entry<K, V>>();
		Iterator<K> kit=keys.iterator();
		Iterator<V> vit=values.iterator();
		while(kit.hasNext()){
			set.add(new MapEntry<K,V>(kit.next(),vit.next()));
		}
		return null;
	}
}
