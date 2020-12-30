package com.lh.practice.problem;

public class P23 {
	public static void main(String[] args) {
		Node<Integer> n1=new Node<Integer>(1);
		Node<Integer> n2=new Node<Integer>(2);
		Node<Integer> n3=new Node<Integer>(1);
		Node<Integer> n4=new Node<Integer>(1);
		Node<Integer> n5=new Node<Integer>(1);
		Node<Integer> n6=new Node<Integer>(1);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n3;
		Node<Integer> res=new P23().entry(n1);
		System.out.println(res);
	}
	public Node<Integer> entry(Node<Integer> head){
		if(head==null) return null;
		//两个指针的位置索引
		int former=0;
		int back=0;
		int cirLength=-1;
		Node<Integer> first=head;
		Node<Integer> second=head;
		while(first.next!=null){
			first=first.next;
			former++;
			if(back!=0&&first==head){
				cirLength=former-back;
				break;
			}
			if(first.next!=null){
				first=first.next;
				former++;
				if(back!=0&&first==head){
					cirLength=former-back;
					break;
				}
				second=second.next;
				back++;
			}
		}
		if(cirLength==-1) throw new RuntimeException("这个链表没有环");
		first=head;
		second=head;
		for(int i=0;i<cirLength;i++){
			first=first.next;
		}
		while(first!=second){
			first=first.next;
			second=second.next;
		}
		return first;
	}
	
}
