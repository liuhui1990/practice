package com.lh.practice.problem;

public class P8<Item> {
	public static <Item> void main(String[] args) {
		BinaryTreeNode<String> a =new BinaryTreeNode<String>();
		BinaryTreeNode<String> b =new BinaryTreeNode<String>();
		BinaryTreeNode<String> c =new BinaryTreeNode<String>();
		BinaryTreeNode<String> d =new BinaryTreeNode<String>();
		BinaryTreeNode<String> e =new BinaryTreeNode<String>();
		BinaryTreeNode<String> f =new BinaryTreeNode<String>();
		BinaryTreeNode<String> g =new BinaryTreeNode<String>();
		BinaryTreeNode<String> h =new BinaryTreeNode<String>();
		BinaryTreeNode<String> i =new BinaryTreeNode<String>();
		a.item="a";
		b.item="b";
		c.item="c";
		d.item="d";
		e.item="e";
		f.item="f";
		g.item="g";
		h.item="h";
		i.item="i";
		a.left=b;
		a.right=c;
		b.left=d;
		b.right=e;
		e.left=h;
		e.right=i;
		a.right=c;
		c.left=f;
		c.right=g;
		b.father=a;
		d.father=b;
		e.father=b;
		h.father=e;
		i.father=e;
		c.father=a;
		f.father=c;
		g.father=c;
		//System.out.println(next(null));
	}
	public static <Item> Item next(BinaryTreeNode<Item> node){
		if(node==null){
			return null;
		}
		BinaryTreeNode<Item> right=node.right;
		BinaryTreeNode<Item> father=node.father;
		if(right!=null){
			if(right.left==null){
				return (Item) right.item;
			}else{
				BinaryTreeNode<Item> lastLeft=right.left;
				while(lastLeft.left!=null){
					lastLeft=lastLeft.left;
				}
				return lastLeft.item;
			}
		}else if(father==null){
			return null;
		}else if(father.left==node){
			return father.item;
		}else if(father.right==node){
			while(father.father!=null){
				if(father.father.left==father){
					return father.father.item;
				}else{
					father=father.father;
				}
			}
			return null;
		}
		return null;
	}
}
class BinaryTreeNode<Item>{
	public BinaryTreeNode(){
		this.father=null;
		this.right=null;
		this.left=null;
	}
	public BinaryTreeNode<Item> left;
	public BinaryTreeNode<Item> right;
	public BinaryTreeNode<Item> father;
	public Item item;

	@Override
	public String toString(){
		return this.item.toString();
	}
}