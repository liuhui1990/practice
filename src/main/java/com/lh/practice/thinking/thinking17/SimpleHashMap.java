package com.lh.practice.thinking.thinking17;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class SimpleHashMap<K,V> extends AbstractMap<K,V> {
	static final int SIZE= 997;
	@SuppressWarnings("unchecked")
	LinkedList<Entry<K, V>>[] buckets =new LinkedList[SIZE];
	@Override
	public Set<Entry<K, V>> entrySet() {
		Set<Entry<K, V>> set=new HashSet<Entry<K,V>>();
		for(LinkedList<Entry<K, V>> bucket:buckets){
			if(bucket!=null){
				for(Entry<K, V> pair:bucket){
					set.add(pair);
				}
			}
		}
		return set;
	}
	public V put(K key,V value){
		V oldValue=null;
		int index=Math.abs(key.hashCode()%SIZE);
		if (buckets[index]==null) 
			buckets[index]=new LinkedList<Entry<K, V>>();
		ListIterator<Entry<K, V>> it=buckets[index].listIterator();
		Entry<K, V> pair=new MapEntry<K, V>(key,value);
		while(it.hasNext()){
			Entry<K, V> entry=it.next();
			if(entry.getKey().equals(key)){
				oldValue=entry.getValue();
				it.set(pair);
				return oldValue;
			}
		}
		buckets[index].add(pair);
		return oldValue;
	}
	public V get(Object key){
		int index =Math.abs(key.hashCode()%SIZE);
		LinkedList<Entry<K, V>> bucket=buckets[index];
		if( bucket==null )
			return null;
		Iterator<Entry<K, V>> it=bucket.iterator();
		while(it.hasNext()){
			Entry<K, V> pair=it.next();
			if(key.equals(pair.getKey())){
				return pair.getValue();
			}
		}
		return null;
	}
	public V remove(Object key){
		int index =Math.abs(key.hashCode()%SIZE);
		LinkedList<Entry<K, V>> bucket=buckets[index];
		if( bucket==null )
			return null;
		ListIterator<Entry<K, V>> it=bucket.listIterator();
		while(it.hasNext()){
			Entry<K, V> pair=it.next();
			if(key.equals(pair.getKey())){
				V ret=pair.getValue();
				it.remove();
				return ret;
			}
		}
		return null;
	}
	public void clear(){
		for(int i=0;i<buckets.length;i++){
			buckets[i]=null;
		}
	}
	public int size(){
		int size=0;
		for(LinkedList<Entry<K, V>> bucket:buckets){
			if(bucket!=null)
				size+=bucket.size();
		}
		return size;
	}
	public static void main(String[] args) {
		Map<Integer,String> map=new SimpleHashMap<Integer,String>();
		map.put(1, "一");
		map.put(2, "二");
		map.put(2, "三");
		System.out.println(map.size());
		map.remove(2);
		System.out.println(map);
		map.clear();
		System.out.println(map);
		HashMap<Integer,String> map2=new HashMap<Integer,String>();
		
		map2.put(2, "2222");
	}	
}
