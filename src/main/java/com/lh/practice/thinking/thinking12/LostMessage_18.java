package com.lh.practice.thinking.thinking12;

public class LostMessage_18 {
	public static void main(String[] args) {
		try {
			LostMessage_18 lm = new LostMessage_18();
			try {
				try {
					lm.f();
				} catch(Exception e){
					System.out.println(e);
				}finally {
					lm.dispose();
				}
			} finally {
				lm.thirExc();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	void thirExc(){
		throw new NullPointerException();
	}
	void f() throws VeryImportantExcep {
		throw new VeryImportantExcep();
	}

	void dispose() throws HuExcep {
		throw new HuExcep();
	}
}

class VeryImportantExcep extends Exception {
	@Override
	public String toString() {
		return "A very Important Exception";
	}
}

class HuExcep extends Exception {
	@Override
	public String toString() {
		return "a hu Exception";
	}
}