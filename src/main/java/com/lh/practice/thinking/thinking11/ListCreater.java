package com.lh.practice.thinking.thinking11;
import java.util.ArrayList;
import java.util.List;
public class ListCreater {
	public static List<String> createPets(int length){
		List pets=new ArrayList();
		String petsArray[]={"pig","dog","cat","rabbit","tortoise","corgi","chow chow","lizard"};
		for(int i=0;i<length;i++){
			if(i<petsArray.length){
				pets.add(petsArray[i]);
			}else{
				pets.add(petsArray[i%petsArray.length]);
			}
		}
		return pets;
	}
}
