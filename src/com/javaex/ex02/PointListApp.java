package com.javaex.ex02;

import java.util.ArrayList;

public class PointListApp {

	public static void main(String[] args) {
		
		ArrayList<Point> pList = new ArrayList<Point>();
		
		Point p1 = new Point(2, 2);
		Point p2 = new Point(3, 3);
		
		// Point 추가
		pList.add(p1);
		pList.add(p2);
		
		// 갯수 확인
		System.out.println(pList.size());
		
		// 특정 Point 정보 읽기
		Point p = pList.get(0);
		System.out.println(p.getX());
		p.draw();
		System.out.println(p.toString());
		
		// Point 전체 draw() 실행하기
//		pList.get(0).draw();
//		pList.get(1).draw();
//		pList.get(2).draw();
		for (int i=0; i<pList.size(); i++) {
			pList.get(i).draw();
		}
		
	}

}
