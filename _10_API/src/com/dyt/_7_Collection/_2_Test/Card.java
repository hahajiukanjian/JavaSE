package com.dyt._7_Collection._2_Test;

public class Card {
	private String name;  	// 牌的数字。有J、Q、K，因此使用String类型。
	private String color; 	// 牌的颜色。♥️、♦️、♠️、♣️
	private int size;		// 牌的大小，牌2比牌3大....

	public Card() {
	}

	public Card(String name, String color, int size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
//		return color + name + "--->" + size;
		return color + name;
	}
}
