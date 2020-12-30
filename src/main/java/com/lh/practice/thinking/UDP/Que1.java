package com.lh.practice.thinking.UDP;

import java.net.*;

//���ָ���˿ڵ���������������ַ�ͱ�����ַ
public class Que1 {
	static InetAddress ip;
	public static void main(String[] args) {
		try {
			InetAddress ip2=InetAddress.getByName("8002");
			ip=InetAddress.getLocalHost();
			String localName=ip.getHostName();
			String localIp=ip.getHostAddress();
			System.out.println("��������"+localName);
			System.out.println("������ַ��"+localIp);
			String portName=ip2.getHostName();
			String portAddress=ip2.getHostAddress();
			System.out.println("�˿�����"+portName);
			System.out.println("�˿ڵ�ַ:"+portAddress);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
