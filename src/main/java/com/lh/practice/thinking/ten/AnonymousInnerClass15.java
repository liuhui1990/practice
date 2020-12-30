package com.lh.practice.thinking.ten;

public class AnonymousInnerClass15 {

}
class WithPara{
	protected String name;
	WithPara(String name){
		this.name=name;
	}
}
class RWPson extends WithPara{
	RWPson(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.name=name;
	}

}
class ReturnWP{
	public WithPara rewp(){

		return new RWPson("hh"){

		};
	}
	public static Service use(){
		Service ser=new Service(){

		};
		return new Service(){

		};
	}

}
interface Service{

}