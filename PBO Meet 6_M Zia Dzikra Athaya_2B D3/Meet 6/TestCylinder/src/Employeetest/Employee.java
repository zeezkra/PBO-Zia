/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employeetest;

/**
 *
 * @author IMPERIAL
 */
public class Employee {
  
    private String name;
    private double salary;
    private int hireDay;
    private int hireMonth;
    private int hireYear;

    public Employee(String name, double salary, int day, int month, int year) {
        this.name = name;
        this.salary = salary;
        this.hireDay = day;
        this.hireMonth = month;
        this.hireYear = year;
    }

    public void print() {
        System.out.println(name + " " + salary + " " + hireYear);
    }

    public void raiseSalary(double byPercent) {
        salary *= (1 + byPercent / 100);
    }

    public int getHireYear() {
        return hireYear;
    }
}
  
