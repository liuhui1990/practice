package com.lh.practice.thinking.UDP;

import java.io.*;
import java.net.*;

/*����һ����8001�˿��ϵȴ���serverSocket���󣬵����յ�һ���ͻ��������������
�������ͻ������������ӵ�socket�����л�������������ͨ���������ͻ���������Ϣ */
public class Que2 {
	private ServerSocket server;
	private Socket socket;
	private BufferedReader reader;
	private BufferedWriter writer;
	public static void main(String[] args) {
		Que2 q2=new Que2();
		q2.getServer(8002);
		
	}
	 void getServer(int port){
		try {
			server=new ServerSocket(port);
//			server.close();
			System.out.println("�������������ִ����ɹ�");
			while(!server.isClosed()){
				System.out.println("�ȴ��ͻ�������");
				socket=server.accept();
				reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				OutputStream ops=socket.getOutputStream();
				String context="�������"+"��ĺ���"+"����\n�ҾͲ�����";
				ops.write(context.getBytes());
				/*byte buf[]=new byte[1024];
				int len=0;*/
				
//				for(int k=0;k<context.length;k++){
//					writer.write(context[k]);
//					writer.newLine();
//				}
//				writer.close();
				
			}
			reader.close();
			writer.close();
			socket.close();
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		server.close();
//		try {
//			if(reader!=null){
//				reader.close();
//			}
//			if(socket!=null){
//				socket.close();
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	 }
}
