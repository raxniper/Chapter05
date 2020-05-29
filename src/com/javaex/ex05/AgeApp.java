package com.javaex.ex05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AgeApp {

	public static void main(String[] args) {
		
		Map<String, Integer> ageMap = new HashMap<String, Integer>();
		
		Integer i01 = new Integer(40);
		Integer i02 = new Integer(30);
		Integer i03 = new Integer(35);
		
		ageMap.put("정우성", i01);
		ageMap.put("유재석", i02);
		ageMap.put("이효리", i03);
		
		System.out.println(ageMap.toString());
		
		ageMap.remove("유재석");
		System.out.println(ageMap.toString());
		
		ageMap.put("이효리", 180);
		ageMap.put("정우성", 190);
		
		System.out.println(ageMap.toString());
		
		Integer age = ageMap.get("이정제");
		System.out.println(age);
		
		int count = ageMap.size();
		System.out.println(count);
		
		Set keys = ageMap.keySet();
		System.out.println(keys);
	}

}
