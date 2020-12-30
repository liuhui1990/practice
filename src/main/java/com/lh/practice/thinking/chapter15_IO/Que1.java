package com.lh.practice.thinking.chapter15_IO;

import java.io.*;

import javax.swing.*;

public class Que1 {
	public static void main(String[] temp) throws IOException {
		File file =new File("word.txt");
		if(file.exists()){
			FileOutputStream out=new FileOutputStream(file);
			byte buy[]="����һֻСë¿���Ҵ���Ҳ�����һ����ͻȻ�뵽����ȥ�ϼ������������ȸ���ڵ��߸��϶���".getBytes();
			out.write(buy);
			out.close();
		}else{
			try {
				file.createNewFile();
				System.out.println("�ļ��Ѵ���");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			FileOutputStream out=new FileOutputStream(file);
			byte buy[]="����һֻСë¿���Ҵ���Ҳ�����һ����ͻȻ�뵽����ȥ�ϼ������������ȸ���ڵ��߸��϶���".getBytes();
			out.write(buy);
			out.close();
		}
		
		byte b[] = new byte[2];
		try {
			FileInputStream re = new FileInputStream("word.txt");
			byte byt[]=new byte[1024];
			int len=re.read(byt);
			System.out.println(new String(byt,0,len));
			FileInputStream rea = new FileInputStream("word.txt");
			ProgressMonitorInputStream in = new ProgressMonitorInputStream(
					null, "��ȡ�ļ�", rea);
			while (in.read(b) != -1) {
				String s = new String(b);
				System.out.print(s);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
