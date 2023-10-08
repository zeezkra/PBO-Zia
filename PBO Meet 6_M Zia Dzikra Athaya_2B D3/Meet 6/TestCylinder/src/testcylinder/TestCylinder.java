/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcylinder;

/**
 *
 * @author IMPERIAL
 */
public class TestCylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cylinder c1 = new Cylinder();
 System.out.println("Cylinder:"
 + " radius=" + c1.getRadius()
 + " height=" + c1.getHeight()
 + " base area=" + c1.getArea()
 + " volume=" + c1.getVolume());
 
 // Declare and allocate a new instance of cylinder
 // specifying height, with default color and radius
 Cylinder c2 = new Cylinder(10.0);
 System.out.println("Cylinder:"
 + " radius=" + c2.getRadius()
 + " height=" + c2.getHeight()
 + " base area=" + c2.getArea()
 + " volume=" + c2.getVolume());
    }
    
}
