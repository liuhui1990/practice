package com.lh.practice.problem;

/**
 * 这个结果是错误的，但我找不出哪里错了
 * @author Administrator
 *
 */
public class P7 {
	/*private static int[] preOrder;
	private static int[] inOrder;
	public P7(int[] preOrder,int[] inOrder){
		this.preOrder=preOrder;
		this.inOrder=inOrder;
	}*/
	public static TreeNode reConstruct(int[] preOrder,int[] inOrder){
		if(preOrder==null&&inOrder==null) return null;
		else if(preOrder==null||inOrder==null){
			throw new RuntimeException("不合法的输入");
		}
		return construct(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
	}
	private static TreeNode construct(int[] preOrder,int[] inOrder,int preStart,int preEnd,int inStart,int inEnd){
		if((preEnd-preStart)==0){
			return null;
		}
		TreeNode root=new TreeNode();
		int rootValue=preOrder[preStart];
		root.value=rootValue;
		if((preEnd-preStart)==1) return root;
		else{
			int rootIn=inStart;
			while(rootIn<=inEnd&&inOrder[rootIn]!=rootValue){
				++rootIn;
			}
			if(rootIn==inEnd&&inOrder[rootIn]!=rootValue) throw new RuntimeException("不合法的输入");
			int leftLength=rootIn-inStart;
			int rightLength=inEnd-rootIn;
			if(leftLength>0)
				root.left=construct(preOrder,inOrder,preStart+1,preStart+leftLength,inStart,inStart+leftLength-1);
			if(leftLength<preEnd-preStart)
				root.right=construct(preOrder,inOrder,preStart+leftLength+1,preEnd,inEnd-rightLength+1,inEnd);
		}
		return root;
	}
	public static void main(String[] args) {
		int[] preOrder={1,2,4,7,3,5,6,8};
		int[] inOrder={4,7,2,1,5,3,8,6};
		TreeNode root=reConstruct(preOrder,inOrder);
		System.out.println(root);
	}
}
class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
}