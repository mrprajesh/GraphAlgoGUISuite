package graph;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajz
 */


import java.util.LinkedList;

public class Point extends java.awt.Point {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int verNumber ;
	LinkedList<Point> AdjList = new LinkedList<Point>();
	private boolean selected = false;
	private int color=1;
	
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public LinkedList<Point> getAdjList() {
		return AdjList;
	}
	
	
	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public Point() {
		// TODO Auto-generated constructor stub
		verNumber = -1;
		
	}
	
	public Point(int num) {
		verNumber = num;
	}

	public Point(java.awt.Point p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	public Point(java.awt.Point p, int num) {
		super(p);
		// TODO Auto-generated constructor stub
		verNumber = num;
	}
	public Point(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	public int getverNumber(){
		return verNumber;
	} 
	public void setverNumber(int num){
		verNumber = num;
	}

}

