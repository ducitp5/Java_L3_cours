package xiv.ArdoiseMazique;

import java.awt.Color;

public class Point {
	Color color = Color.red;
	int size = 10;
	int x;
	int y;
	String type = "ROND";

	public Point(int x, int y, int size, Color color, String type) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.color = color;
		this.type = type;
	}

	public Color getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getType() {
		return type;
	}
}