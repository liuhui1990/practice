package com.lh.practice.thinking.thinking12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingException_6 extends Exception{
	public static void main(String[] args) {
		try{
			throw new logExcep1();
		}catch(logExcep1 e){
			e.printStackTrace();
			System.out.println("here:"+e);
		}
	}
	void f() throws logExcep1{
		throw new logExcep1();
	}
}
class logExcep1 extends Exception{
	private static Logger logger=Logger.getLogger("logExcep1");
	public logExcep1(){
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}