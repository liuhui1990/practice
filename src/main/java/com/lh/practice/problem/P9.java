package com.lh.practice.problem;

import java.util.Stack;

public class P9 {
	public static void main(String[] args) {
		CQueue<String> cq=new CQueue<String>();
		for(int i=0;i<9;i++){
			cq.addendTail(""+i);
		}
		while(true){
			System.out.println(cq.deleteHead());
		}
	}
}
class CQueue<T>{
	private Stack<T> appendStack=new Stack<T>();
	private Stack<T> deleteStack=new Stack<T>();
	public void addendTail(T t){
		appendStack.push(t);
	}
	public T deleteHead(){
		if(deleteStack.isEmpty()){
			if(appendStack.isEmpty()){
				throw new RuntimeException("队列已经为空！");
			}else{
				while(!appendStack.isEmpty()){
					deleteStack.push(appendStack.pop());
				}
			}
		}
		return deleteStack.pop();
	}
}