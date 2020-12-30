package com.lh.practice.thinking.three;

public class Practice14 {
	private static void compare(String s1,String s2){
		boolean r1,r2,r3,r4,r5,r6,r7;
		r1=s1==s2;
		r2=s1!=s2;
//		r3=s1.equals(s2);
		System.out.print(" "+s1+"=="+s2+":"+r1);
		System.out.print(" "+s1+"!="+s2+":"+r2);
//		System.out.println(" "+s1+".equals("+s2+"):"+r3);
	}
	public static void main(String[] args) {
		String s1="a";
		String s2="a";
		String s3="b";
		String n1=null;
		String n2=null;
		String n3="";
		String sn1=new String("a");
		String sn2=new String("a");
		Practice14.compare(s1, s2);
		Practice14.compare(s2, s3);
		Practice14.compare(sn1, sn2);	
//		Practice14.compare(n1, n2);
		Practice14.compare(n2, n3);
		}
}
