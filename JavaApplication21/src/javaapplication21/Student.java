/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author win10-a
 */
    public class Student extends person implements Printable {

    public Student(String name, int age) {
        super(name, age);
    } 
    @Override
    public void printDetails() {
        System.out.println("Student: " + getName() + ", Age: " + getAge());
    }
}



