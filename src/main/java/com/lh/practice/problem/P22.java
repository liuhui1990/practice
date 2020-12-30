package com.lh.practice.problem;

public class P22 {
	public static void main(String[] args) {
		Node<Integer> n=new Node<Integer>(3);
		n.next=new Node<Integer>(4);
		n.next.next=new Node<Integer>(5);
		System.out.println(new P22().lastButOneNode(null, 0));
	}
	public Node<Integer> lastButOneNode(Node<Integer> head,int n){
		if(head==null) throw new RuntimeException("不合法的输入");
		Node<Integer> ret=head;
		Node<Integer> pt=head;
		int index=1;
		while(pt.next!=null){
			pt=pt.next;
			index++;
			if(index>n) ret=ret.next;
		}
		if(index<n) throw new RuntimeException("不合法的输入");
		return ret;
	}
}
