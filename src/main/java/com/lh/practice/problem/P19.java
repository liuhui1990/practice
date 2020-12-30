package com.lh.practice.problem;

public class P19 {
	public static void main(String[] args) {
		String exp="aaaaaddddaa";
		String pat="a*a.d*a*a";
		System.out.println(match(exp,pat));
	}
	public static boolean match(String exp,String pat){
		if(exp==null||pat==null){
			return false;
		}
		char[] expArr=exp.toCharArray();
		char[] patArr=pat.toCharArray();
		int eLength=expArr.length;
		int pLength=patArr.length;
		return matchRecu(expArr,patArr,0,0,eLength,pLength);
	}
	private static boolean matchRecu(char[] exp,char[] pat,int eIndex,int pIndex,int eLength,int pLength){
		if(pIndex==pLength&&eIndex==eLength) return true;
		else if(pIndex==pLength||eIndex==eLength) return false;
		if(pat[pIndex]=='.'){
			if(pIndex<=pLength-2&&pat[pIndex+1]!='*'){
				pIndex++;
				eIndex++;
			}else if(pIndex<=pLength-2&&pat[pIndex+1]=='*'){
				return matchRecu(exp,pat,eIndex,pIndex+2,eLength,pLength)||matchRecu(exp,pat,eIndex+1,pIndex+2,eLength,pLength)||matchRecu(exp,pat,eIndex+1,pIndex,eLength,pLength);
			}else{
				pIndex++;
				eIndex++;
			}
			return matchRecu(exp,pat,eIndex,pIndex,eLength,pLength);
		}else if(pat[pIndex]!='*'){
			char c=pat[pIndex];
			if(pIndex<=pLength-2&&pat[pIndex+1]!='*'){
				if(c==exp[eIndex]) {
					pIndex++;
					eIndex++;
				}else{
					return false;
				}
			}else if(pIndex<=pLength-2&&pat[pIndex+1]=='*'){
				if(c==exp[eIndex]){
					return matchRecu(exp,pat,eIndex+1,pIndex+2,eLength,pLength)||matchRecu(exp,pat,eIndex+1,pIndex,eLength,pLength);
				}else{
					return matchRecu(exp,pat,eIndex,pIndex+2,eLength,pLength);
				}
			}else{
				if(c==exp[eIndex]) {
					pIndex++;
					eIndex++;
				}else{
					return false;
				}
			}
			return matchRecu(exp,pat,eIndex,pIndex,eLength,pLength);
		}else{
			throw new RuntimeException("invilad input");
		}
	}
}
