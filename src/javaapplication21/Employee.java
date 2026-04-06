/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author win10-a
 */
    public class Employee extends person implements Printable {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
    }



