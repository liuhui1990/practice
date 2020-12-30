package com.lh.practice.sort;

public class Sort {
	public static void main(String[] args){
		int arr[]={7,89,5,78,0,55,7,34};
		int arr2[]={7,89,5,78,0,55,7,34,0};
		System.out.println(arr[7]);
		System.out.println(arr.length);
		System.out.println(arr);
		Sort s1=new Sort();
		s1.bubSort(arr);
		s1.showArray(arr);
		s1.showArray(arr2);
		s1.selectSort(arr2);
		s1.showArray(arr2);
		s1.reverseSort(arr2);
		s1.showArray(arr2);
	}
	public void bubSort(int[] array){
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array.length-i;j++){
				if(array[j]>array[j+1]){
					int temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
	}
	public void selectSort(int[] array){
		for(int i=1;i<array.length;i++){
			int tem=array[0];
			int id = 0;
			int len=array.length;
			for (int j = 0; j < array.length - i; j++) {
				if (tem < array[j + 1]) {
					tem = array[j + 1];
					id = j + 1;
				} 
			}
			int tep=array[len-i];
			array[len-i]=tem;
			array[id]=tep;
			}
		}
	public void reverseSort(int[] array){
		int fen=array.length/2;
		for(int i=0;i<fen;i++){
			int tem=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=tem;
		}
	}
	
	public void showArray(int[] array){
		for(int i=0;i<array.length;i++){
			if(i==0){
				System.out.println("");
			}
			System.out.print(array[i]+" ");
		}
	}
	

}
