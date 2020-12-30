package com.lh.practice.thinking.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class GetChannel {
	public static void main(String[] args) throws IOException {
		FileChannel fc=new FileOutputStream("data.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes()));
		ByteBuffer bb=ByteBuffer.allocate(1024);
		FileChannel rc=new FileInputStream("data.txt").getChannel();
		rc.read(bb);
		bb.flip();
		System.out.println(bb.asCharBuffer());
		while(bb.hasRemaining()){
			System.out.print((char)bb.get());
		}
		String encoding =System.getProperty("file.encoding");
		System.out.println("\n"+encoding);
		bb.rewind();
		System.out.println(Charset.forName(encoding).decode(bb));
		
		fc=new FileOutputStream("data.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes("UTF-16BE")));
		fc.close();
		fc=new FileInputStream("data.txt").getChannel();
		bb.clear();
		fc.read(bb);
		bb.flip();
		System.out.println(bb.asCharBuffer());
	}
}
