package com.javaex.ex03;

import java.util.HashSet;
import java.util.Set;

public class SetApp {

	public static void main(String[] args) {
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		Integer i01 = new Integer(3);
		Integer i02 = new Integer(5);
		
		iSet.add(i01);
		iSet.add(i02);
		
		for (Integer i : iSet) {
			System.out.println(i);
		}
		
//		Integer를 int로 변경하여도 나올까?
//		숫자 형태는 자동으로 Boxing, unBoxing이 되므로 가능하다.
//		for (int i : iSet) {
//			System.out.println(i);
//		}
		
		System.out.println("-----------------------------");
		
		iSet.remove(i01);
		for (Integer i : iSet) {
			System.out.println(i.toString());
		}

	}

}
