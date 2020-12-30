package com.lh.practice.problem;

import java.util.Stack;

public class P6<Item> {
	public void printFromLast(Node<Item> head){
		if(head==null) return;
		Stack<Item> s=new Stack<Item>();
 		while(head.next!=null){
			s.push(head.val);
			head=head.next;
		}
 		while(!s.isEmpty()){
 			System.out.println(s.pop());
 		}
	}
	//递归
	public void print(Node<Item> head){
		if(head==null) return;
		printRecursion(head);
	}
	private void printRecursion(Node<Item> head){
		if(head.next!=null){
			printRecursion(head.next);
		}
		System.out.println(head.val);
	}
	public static void main(String[] args) {
		
	}
}