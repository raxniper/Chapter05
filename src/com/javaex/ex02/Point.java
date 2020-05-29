package com.javaex.ex02;

public class Point {

	// Field
	private int x;
	private int y;
	
	// C
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// g/s
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// Method
	public void draw() {
		System.out.println("[X점]"+this.x+"   [Y점]"+this.y);	
	}
	
}
