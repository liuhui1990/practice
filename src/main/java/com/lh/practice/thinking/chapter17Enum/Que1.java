package com.lh.practice.thinking.chapter17Enum;
//����һ��ö���࣬��switch����ȡö�����͵�ֵ
public class Que1 {
	public class test{
		
	}
	public enum Enumlei{
		par1,par2,par3,par4,par5
	}
	public static void main(String[] args) {
		Que1.chose(Enumlei.par2);
//		Que1.chose(3);
		System.out.println(Enumlei.par1);
	}
	public static void chose(Enumlei en){
		switch(en){
		case par1:
			System.out.println(Enumlei.par1);
			break;
		case par2:
			System.out.println(Enumlei.par2);
			break;
		case par3:
			System.out.println(Enumlei.par3);
			break;
		}
		
			
	}
}
