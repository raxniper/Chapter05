package com.javaex.lotto;

import java.util.HashSet;
import java.util.Set;

public class lottoApp {

	public static void main(String[] args) {
		
		Set<Integer> lottoSet = new HashSet<Integer>();
		
		// 로또 생성 입력
		while(true) {
			if(lottoSet.size()>=6) {
				break;
			}
			int no = (int) (Math.random()*45)+1;
			System.out.print(no + "\t");
			lottoSet.add(no);
		}
		
		// 로또 번호 출력
		System.out.println("");
		for(Integer i: lottoSet) {
			System.out.print(i.toString() + "\t");
		}
		
	}
}
