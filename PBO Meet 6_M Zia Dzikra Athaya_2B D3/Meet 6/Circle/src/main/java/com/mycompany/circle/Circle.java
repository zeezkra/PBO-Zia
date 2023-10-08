/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circle;

/**
 *
 * @author IMPERIAL
 */

public class Circle {
    private double radius;
    private String color;
    
public static void main(String[] args){    
        
    public Circle() {
        radius = 1.0;
        color = "red";
    }
 
    public Circle(double r) { 
        this.radius = r;
        color = "red";
    }
 
    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }
 
    public double getRadius() {
        return radius; 
    }
 
    public double getArea() {
        return radius * radius * Math.PI;
    }
 
    public String getColor() {
        return color;
    }
 
    public void setColor(String c) {
        color = c;
    }
 
    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
