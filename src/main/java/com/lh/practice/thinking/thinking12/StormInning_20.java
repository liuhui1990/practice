package com.lh.practice.thinking.thinking12;

public class StormInning_20 extends Abs implements I{

	public StormInning_20() throws Ext, ParExc1 {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void im1() throws SonExc2{
		// TODO Auto-generated method stub

	}

	@Override
	public void atBat(){
		// TODO Auto-generated method stub

	}
	@Override
	public void Absmeth2(){

	}

}

abstract class Abs{
	public Abs() throws ParExc1{}
	public void  Absmeth1() throws ParExc1{
	}
	public abstract void atBat() throws SonExc1,SonExc2;
	public void Absmeth2() throws ParExc1{}
}
interface  I{
	public void im1() throws ParExc1;
	public void Absmeth2() throws SonExc2;

}
class Ext extends Exception{}
class ParExc1 extends Exception{
}
class SonExc1 extends ParExc1{}
class SonExc2 extends ParExc1{}