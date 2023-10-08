/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcylinder;

/**
 *
 * @author IMPERIAL
 */
public class Circle {
        private double radius;
	private String color;
	 
	public Circle() {
	radius = 1.0;
	color = "red";
	}
	 
	public Circle(double r) {
	radius = r;
	color = "red";
	}
	
	public Circle(double r, String color) {
		radius = r;
		color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	 
	public double getRadius() {
	return radius; 
	}
	 
	public double getArea() {
	return radius*radius*Math.PI;
	}

	public String toString() {
	return "Circle[radius=" + radius + " color=" + color + "]";
	}
}