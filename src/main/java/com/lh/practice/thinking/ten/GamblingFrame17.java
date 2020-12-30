package com.lh.practice.thinking.ten;

import java.util.Random;

public class GamblingFrame17 {
	public static void gamb(ToolFactory fac){
		fac.make().toss();
	}
	public static void main(String[] args) {
		gamb(Coin.factory);
		gamb(Dice.factory);
	}
}
interface Tool{
	void toss();
}
interface ToolFactory{
	Tool make();
}
class Coin implements Tool{
	private Coin(){}
	@Override
	public
	void toss(){
		int ran=new Random().nextInt(2)+1;
		System.out.println("coin result:"+ran);
	}
	public static ToolFactory factory=new ToolFactory(){
		@Override
		public
		Tool make(){
			return new Coin();
		}
	};
}
class Dice implements Tool{
	private Dice(){}
	@Override
	public void toss(){
		int res=new Random().nextInt(5)+1;
		System.out.println("Dice result:"+res);
	}
	public static ToolFactory factory=new ToolFactory(){
		@Override
		public Tool make(){
			return new Dice();
		}
	};
}