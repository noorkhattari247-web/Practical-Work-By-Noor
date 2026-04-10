/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;
import java.util.*;
/**
 *
 * @author win10-a
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Printable s = new Student("Noor", 22);
        Printable e = new Employee("AHMAD", 30, 500);
        person p = new person("Ali", 20);
        System.out.println(p);

        Employee m = new Employee("Sara", 50, 1000);
        System.out.println(m);

        Manager b = new Manager("Omar", 40, 900, "IT");
        System.out.println(b);

        s.printDetails();
        e.printDetails();
        printArea(new Circle(3));
        printArea(new Rectangle(4,5));
       
      List<shape> shapes = new ArrayList<>();

      shapes.add(new Circle(2));
      shapes.add(new Rectangle(3,4));
      shapes.add(new Triangle(5,6));

    for (shape a : shapes) {
    System.out.println(a.area());
                                  }
    }
    public static void printArea(shape s) {
    System.out.println("Area: " + s.area());
    
                                     }
        }
