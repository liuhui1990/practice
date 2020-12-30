package com.lh.practice.thinking.thinking21.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P13 {
	public static final int SIZE=10;
	public static CircularSet serials=new CircularSet(1000);
	private static ExecutorService exec=Executors.newCachedThreadPool();
	static class SerialChecker implements Runnable{
		public void run(){
			while(true){
				int serial=SerialNumberGenerator.nextSerialNumber();
				if(serials.contains(serial)){
					System.out.println("重复了："+serial);
					System.exit(0);
				}
				serials.add(serial);
			}
		}
	}
	public static void main(String[] args) throws Exception{
		for(int i=0;i<SIZE;i++){
			exec.execute(new SerialChecker());
		}
	}
}
class CircularSet{
	private int[] array;
	private int len;
	private int index=0;
	public CircularSet(int size){
		array=new int[size];
		len=size;
		for(int i=0;i<size;i++){
			array[i]=-1;
		}
	}
	public synchronized void add(int i){
		array[index]=i;
		index=++index%len;
	}
	public synchronized boolean contains(int val){
		for(int i=0;i<len;i++){
			if(array[i]==val) return true;
		}
		return false;
	}
}
class SerialNumberGenerator{
	private static volatile int serialNumber=0;
	public static  int nextSerialNumber(){
		return serialNumber++;
	}
}
class Solution {
    public int findContentChildren(int[] g, int[] s) {
    	java.util.Arrays.sort(g);
    	java.util. Arrays.sort(s);
        int lg=g.length;
        int ls=s.length;
        int ig=-1;
        int is=-1;
        int ret=0;
        while(++ig<lg){
            while(s[++is]<g[ig]){
            }
            if(s[is]>=g[ig])
                ret++;
            if(is==lg) return ret;
        }
        return ret;
    }
}