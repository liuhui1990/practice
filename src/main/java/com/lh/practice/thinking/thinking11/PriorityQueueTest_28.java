package com.lh.practice.thinking.thinking11;

import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueTest_28 {
	public static void main(String[] args) {
		PriorityQueue<Double> pq=new PriorityQueue<Double>();
		Random rand=new Random();
		for(int i=0;i<10;i++){
			pq.offer(rand.nextDouble());
		}
		while(pq.size()>0){
			System.out.println(pq.poll());
		}
		SimObj so1=new SimObj();
		SimObj so2=new SimObj();
		PriorityQueue<SimObj> sopq=new PriorityQueue<SimObj>();
		sopq.offer(so1);
		sopq.offer(so2);

	}
}
class SimObj extends Object{
}
