package com.lh.practice.thinking.io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPCompress {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("data.txt"));
		BufferedOutputStream out=new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("test.gz")));
		int c;
		while((c=br.read())!=-1){
			out.write(c);
		}
		br.close();
		out.close();
		System.out.println("compress complete");
		BufferedReader br2=new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("test.gz"))));
		String s;
		while((s=br2.readLine())!=null){
			System.out.println(s);
		}
	}
}
