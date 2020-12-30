package com.lh.practice.shuaitu;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class TacticsInjury {
	static double getDamage(double target,double probability,int prepare,double firstDamage,double continuousDamage,double attribute,int cRound){
		final double DECLINE=Math.pow(1d/2, 1d/7);
		double damage = 0;
		double attrProportion=2.5;
		continuousDamage=continuousDamage+attribute*attrProportion;
		double secondDamage = continuousDamage * DECLINE;
		double thirdDamage = secondDamage * DECLINE;
		double firstCon=(cRound>0)?continuousDamage:0;
		for (int i = prepare; i < 8; i++) {
			secondDamage = (cRound-1 > 0 && i < 8) ? (secondDamage) : 0;
			thirdDamage = (cRound-1 > 1 && i < 7) ? (thirdDamage) : 0;
			damage += probability * target
					* (firstDamage +firstCon+ secondDamage + thirdDamage)
					* Math.pow(DECLINE, i);
		}

		return damage;
	}
	/*class MyMap extends HashMap{
		@Override
		public String toString(){
			System.out.println(String+":"+this.get(key););
		}
	}*/
	public static void main(String[] args) {
		Map<String,Double> damageList=new HashMap<String, Double>();
		damageList.put("溃堤",getDamage(2, 0.45, 0,39.9, 0,   5,2));
		damageList.put("大水",getDamage(2,  0.5, 1,102.5,0,   5,2));
		damageList.put("大火",getDamage(2.5,0.5, 1,59.5, 59.5,0,1));
		damageList.put("毒泉",getDamage(2,  0.5, 1,0,    42.5,0,2));
		damageList.put("火辎",getDamage(2,  0.5, 1,37.5, 37.5,0,1));
		damageList.put("火箭",getDamage(2,  0.45, 1,34.5, 37.5,0,1));
		damageList.put("伐谋",getDamage(1,  0.4, 0,104.5,0,44.5,2));
		damageList.put("竭泽",getDamage(2, 0.45, 0,33.7, 0,   4,1));
		damageList.put("落石",getDamage(1.5,0.45,0,46.1, 0, 2.6,1));
		damageList.put("绝道",getDamage(1.5,0.45,0,52.5, 0,   3,2));
		damageList.put("危崖",getDamage(2,  0.5, 1,105,  0, 3.6,2));
		damageList.put("楚歌",getDamage(2.5,0.5, 1,0, 63.5,0,2));
		damageList.put("夹攻",getDamage(1.5,0.45,0,44.8,0,0,0));
		damageList.put("黄天",getDamage(3,0.35,1,88,48.5,0,2));
		damageList.put("声东",getDamage(1.5,0.5,1,115.5,0,0,0));
		damageList.put("落雷",getDamage(1,0.35,0,74,0,0,0));
		damageList.put("十面",getDamage(3,0.4,1,65,0,0,0));
		//damageList.put("",getDamage());
		//damageList.put("",getDamage());
		sortAndPrint(damageList);
		System.out.println(damageList);
	}
	static void sortAndPrint(Map<String,Double> map){
		//这里将map.entrySet()转换成list
        List<Entry<String,Double>> list = new ArrayList<Entry<String,Double>>(map.entrySet());
        //然后通过比较器来实现排序
        Collections.sort(list,new Comparator<Entry<String,Double>>() {
            //升序排序
            @Override
			public int compare(Entry<String, Double> o1,
                    Entry<String, Double> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(Entry<String,Double> mapping:list){
        		int val=(int) Math.floor(mapping.getValue());
               System.out.println(mapping.getKey()+":"+val);
          }
	}
}
