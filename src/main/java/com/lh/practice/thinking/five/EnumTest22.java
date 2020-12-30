package com.lh.practice.thinking.five;

public class EnumTest22 {
	public static void main(String[] args) {
		for(Moneys m:Moneys.values()){
			System.out.println(m+" "+m.ordinal());
		}
		panduan(Moneys.ONE);
	}
	 static void panduan(Moneys m){
		switch(m){
		case ONE: System.out.println("这是一块钱");break;
		case TWO:System.out.println("2");
		case FIVE:System.out.println("5");
		case TEN:System.out.println("10");
		case TWENTY:
			default: System.out.println(20);
		}
	}
}
enum Moneys{
	ONE,TWO,FIVE,TEN,TWENTY
}