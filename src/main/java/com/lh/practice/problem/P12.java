package com.lh.practice.problem;

public class P12 {

	public boolean hasPath(char[][] arr,String str){
		if(arr==null||arr.length==0||arr[0].length==0||str==null){
			throw new RuntimeException("输入不合法");
		}
		char[] target=str.toCharArray();
		int cols=arr.length;
		int rows=arr[0].length;
		boolean[][] visited=new boolean[cols][rows];
		int index=0;
		for(int i=0;i<cols;i++){
			for(int j=0;j<rows;j++){
				if(hasPath(arr,cols,rows,target,i,j,index,visited)) return true;
			}
		}
		return false;
	}
	private boolean hasPath(char[][] arr,int cols,int rows,char[] str,int col,int row,int index,boolean[][] visited){
		if(index==str.length) return true;
		boolean ret=false;
		if(col>=0&&col<cols&&row>=0&&row<rows&&!visited[col][row]&&arr[col][row]==str[index]){
			index++;
			visited[col][row]=true;
			ret=hasPath(arr,cols,rows,str,col+1,row,index,visited)||hasPath(arr,cols,rows,str,col-1,row,index,visited)||hasPath(arr,cols,rows,str,col,row+1,index,visited)||hasPath(arr,cols,rows,str,col,row-1,index,visited);
			if(!ret){
				index--;
				visited[col][row]=false;
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		//char[][] arr={{'a','c','g'},{'b','f','d'},{'t','c','e'},{'g','s','h'}};
		char[][] arr={{'a','a','a'}};
		Timer.start();
		System.out.println(new P12().hasPath(arr, "aa"));
		Timer.end();
	}
}
