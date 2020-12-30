package com.lh.practice.thinking.UDP;

import java.net.*;
import java.io.*;

public class Que2Another {
	Socket socket;
	private BufferedReader reader;
	public static void main(String[] args) {
		Que2Another q2a=new Que2Another();
		q2a.connect();
	}
	private void connect(){
		try {
			socket=new Socket("127.0.0.1",8002);
			reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			getServerMessage();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void getServerMessage(){
		try{
			while((reader.readLine())!=null){
				System.out.println("��������"+reader.readLine());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		try {
			if(reader==null){
				reader.close();
			}
			if(socket==null){
				socket.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
