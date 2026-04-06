/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author win10-a
 */
    
   public class person {

    private String name;
    private int age;

    
    public person() {
        this.name = "Unknown";
        this.age = 0;
    }

    
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
   
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
    return "Name: " + name + ", Age: " + age;
}

   }
 


