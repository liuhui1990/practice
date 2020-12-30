package com.lh.practice.thinking.thinking9;

import java.util.Random;

public class Factory2 {
	static void toss(thingFac tf){
		thing t=tf.getThing();
		t.toss();
	}
	public static void main(String[] args) {
		toss(new CoinFac());
		toss(new DiceFac());
	}
}
interface thing{
	void toss();
}
interface thingFac{
	thing getThing();
}
class Coin implements thing{
	@Override
	public void toss(){
		Random ran=new Random();
		int res=ran.nextInt(2);
		System.out.println("抛硬币的结果"+res);
	}
}
class Dice implements thing{
	@Override
	public void toss(){
		Random ran=new Random();
		int res=ran.nextInt(6);
		System.out.println("掷筛子的结果："+res);
	}
}
class DiceFac implements thingFac{
	@Override
	public thing getThing(){
		return new Dice();
	}
}
class CoinFac implements thingFac{
	@Override
	public thing getThing(){
		return new Coin();
	}
}