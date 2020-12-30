package com.lh.practice.thinking.chapter15_IO;
import java.io.*;

public class Que2 {
	public static void main(String[] args) throws IOException {
		char a[]="���컹�����˰�".toCharArray();
		for(int i=0;i<a.length;i++){
			a[i]=(char) (a[i]^'T');
		}
		File file=new File("word2.txt");
		try {
			FileWriter fw=new FileWriter(file);
			fw.write(a,0,a.length);
			fw.close();
			FileReader fr=new FileReader(file);
			char cha[]=new char[7];
			int len=fr.read(cha);
			System.out.println("����ǰ��"+new String(cha,0,len));
			fr.close();
			
//			fr=new FileReader(file);
//			int len2=fr.read(cha);
			System.out.println("len:"+len);
			for(int i=0;i<cha.length;i++){
				cha[i]=(char) (cha[i]^'T');
			}
			System.out.println("���ܺ�"+new String(cha,0,len));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
