package com.lh.practice.problem;


public class Node<T> {
	Node<T> next;
	T val;
	public Node(T val){
		this.val=val;
	}
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		StringBuffer sb=new StringBuffer();
		Node<T> then=next;
		sb.append(val);
		while(then!=null){
			sb.append(" -> ");
			sb.append(then.val);
			then=then.next;
		}
		return sb.toString();
	}
	/**
	 * 生成一个由多个节点组成的链表
	 * @param vals 链表中节点们的值
	 * @return 头结点
	 */
	public static<T> Node<T> NodeList(T... vals){
		if(vals==null||vals.length<=0) throw new RuntimeException("请输入至少一个值");
		Node<T> head=new Node<T>(vals[0]);
		Node<T> last=new Node<T>();
		int index=1;
		while(index!=vals.length){
			if(index==1) {
				head.next=new Node<T>(vals[index]);
				last=head.next;
			} else {
				last.next=new Node<T>(vals[index]);
				last=last.next;
			}
		}
		return head;
	}
}
