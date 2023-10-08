/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employeetest;

/**
 *
 * @author IMPERIAL
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        employees[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        employees[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        for (int i = 0; i < employees.length; i++) {
            employees[i].raiseSalary(5);
        }

        for (Employee employee : employees) {
            employee.print();
        }
    }
}
