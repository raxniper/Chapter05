package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(4, 4);
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		for(Point p: pSet) {
			System.out.println(p);
		}
		
		System.out.println("--------------------------");
		
		Point p04 = new Point(3, 3);
		pSet.add(p04);
		
		for(Point p:pSet) {
			System.out.println(p.toString());
		}
		
		System.out.println("--------------------------");
		
		System.out.println(p01.equals(p02));
		System.out.println(p02.equals(p04));
	}

}
