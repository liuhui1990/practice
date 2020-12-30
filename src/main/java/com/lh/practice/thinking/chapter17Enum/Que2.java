package com.lh.practice.thinking.chapter17Enum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//����һ�������࣬ʹ��extends�ؼ������Ƹ÷����������Ϊlist�ӿڣ����ֱ𴴽��������Ͷ���
public class Que2<T extends List> {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Que2<ArrayList> q1=new Que2<ArrayList>();
		Que2<LinkedList> q2=new Que2<LinkedList>();
	}
	
	
}
