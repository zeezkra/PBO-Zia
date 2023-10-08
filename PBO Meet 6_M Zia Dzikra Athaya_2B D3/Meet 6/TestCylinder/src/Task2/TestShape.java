/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task2;

/**
 *
 * @author IMPERIAL
 */
//M ZIA DZIKRA ATHAYA (221511053)
public class TestShape {
       public static void main(String[] args) {
		
		Shape shape1 = new Shape();
		Shape shape2 = new Shape("Red", true);
		
		System.out.println(shape1.toString());
		System.out.println(shape2.toString());
		
		Circle circle1 = new Circle();
		System.out.println(circle1.toString());
		
		Rectangle rect1 = new Rectangle();
		System.out.println(rect1.toString());
		
		Square square1 = new Square(5);
		System.out.println(square1.toString());
	} 
}
