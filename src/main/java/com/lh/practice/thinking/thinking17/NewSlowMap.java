package com.lh.practice.thinking.thinking17;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NewSlowMap<K,V> extends AbstractMap<K, V>{
	private List<Entry<K, V>> entrys =new ArrayList<Entry<K, V>>();
	@Override
	public V put(K key,V value){
		Iterator<Entry<K, V>> it=entrys.listIterator();
		while(it.hasNext()){
			Entry<K, V> entry=it.next();
			if(entry.getKey().equals(key)){
				V oldValue=entry.getValue();
				entry.setValue( value);
				return oldValue;
			}
		}
		entrys.add(new MapEntry<K,V>(key,value));
		return null;
	}
	public static void main(String[] args) {
		Map<Integer,String> map=new NewSlowMap<Integer,String>();
		map.put(1, "111");
		map.put(2, "222");
		map.put(2, "333");
		System.out.println(map);
	}
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("{");
		for(Entry<K, V> entry:entrys){
			sb.append(entry.getKey());
			sb.append(" = ");
			sb.append(entry.getValue());
			sb.append(",");
		}
		sb.substring(0, sb.length()-2);
		sb.append("}");
		return sb.toString();
	}
	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
}
