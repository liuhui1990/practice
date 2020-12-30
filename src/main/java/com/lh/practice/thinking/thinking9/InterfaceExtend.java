package com.lh.practice.thinking.thinking9;

public class InterfaceExtend {
	static void m1(chinese c){
		c.speakChinese();
	}
	static void m2(male m){
		m.strong();
	}
	static void m3(student s){
		s.study();
	}
	static void m4(boy b){
		b.hasName();
	}
	public static void main(String[] args) {
		xiaoming x=new xiaoming();
		m1(x);
		m2(x);
		m3(x);
		m4(x);
	}
}
interface male{
	public String strong();
}
interface chinese{
	void speakChinese();
}
interface student{
	void study();
}
interface boy extends male,chinese,student{
	void hasName();
}
class littleStudent{
	public void cry(){
	}
}
class xiaoming extends littleStudent implements boy{

	@Override
	public String strong() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void speakChinese() {
		// TODO Auto-generated method stub

	}

	@Override
	public void study() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hasName() {
		// TODO Auto-generated method stub

	}

}