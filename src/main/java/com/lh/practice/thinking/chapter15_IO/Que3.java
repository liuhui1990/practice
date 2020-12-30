package com.lh.practice.thinking.chapter15_IO;

import java.io.*;

public class Que3 {
static final int lineLength = 81;
	
	public static void main(String[] args) {
		FileOutputStream fos;

		byte[] phone = new byte[lineLength];
		byte[] name = new byte[lineLength];
		try {
			fos = new FileOutputStream("word3.txt");
			while (true) {
				System.err.println("������һ�����֣�");
				if ("done".equalsIgnoreCase(new String(name, 0, 0, 4))) {
					System.out.println("¼�����");
					break;
				}
				System.err.println("������绰�ţ�");
				readLine(phone);
				for (int i = 0; phone[i] != 0; i++) {
					fos.write(phone[i]);
				}
				fos.write(',');
				for (int j = 0; name[j] != 0; j++) {
					fos.write(name[j]);
				}
				fos.write('\n');
				System.out.println("��Ϣ�Ѿ�д���ļ�");
			}
			fos.close();
		} catch (Exception e) {
			// TODO �Զ����� catch ��
			e.printStackTrace();
		}
	}
	
	private static void readLine(byte[] name) throws IOException {
		int b = 0, i = 0;
		while ((i < (lineLength - 1)) && (b = System.in.read()) != '\n') {
			name[i++] = (byte) b;
		}
		name[i] = (byte) 0;
	}

}
