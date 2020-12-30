package com.lh.practice.tools.pets;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pet {
	@Override
	public String toString(){
		return this.getClass().getSimpleName();
	}
	private static final List<Pet> petTypes=new ArrayList<Pet>();
	static{
		petTypes.add(new GoldenRetriever());
		petTypes.add(new ChowChow());
		petTypes.add(new JiWawa());
		petTypes.add(new Poodle());
		petTypes.add(new Husky());
		petTypes.add(new BritishShorthair());
		petTypes.add(new Persian());
		petTypes.add(new Munchkin());
		petTypes.add(new Muppet());
	}
	private static final Random rand=new Random(23);
	/**
	 *	生成装有Pet子类（只有最底层的子类）对象的list
	 * @param size list的长度
	 * @return 返回一个装有Pet对象的list
	 */
	public static List<Pet> petsList(int size){
		List<Pet> list=new ArrayList<Pet>(size);
		for(int i=0;i<size;i++){
			int r=rand.nextInt(petTypes.size());
			list.add(i, petTypes.get(r));
		}
		return list;
	}
	/**
	 *	生成一个随机的Pet子类的对象（仅最底层的子类）
	 * @return Pet子类的对象
	 */
	public Pet randomPet(){
		return petTypes.get(rand.nextInt(petTypes.size()));
	}
}
class Dog extends Pet{
}
class GoldenRetriever extends Dog{}
class ChowChow extends Dog{}
class JiWawa extends Dog{}
class Poodle extends Dog{}
class Husky extends Dog{}

class Cat extends Pet{
}
class BritishShorthair extends Cat{}
class Persian extends Cat{}
class Munchkin extends Cat{}
class Muppet extends Cat{}