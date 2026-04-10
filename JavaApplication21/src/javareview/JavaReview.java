/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javareview;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author win10-a
 */


public class JavaReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // point #1 
          System.out.println ("Hello World");
         //point #2
         
          // Declaer Primitive Variables
         int x = 12;
         double y = 2.5;
         boolean z = true;
         char h = 'A';
         
       // Arithmetic
       System.out.println(x + y);
       System.out.println(x * y);
       
        // Comparison
       System.out.println(y < 5);
       System.out.println(x == 12);
        
       // Logical
       System.out.println(z && false);
       System.out.println(z && (x>5));
        
        //point #3
        
        //Control Flow Exercises
        int n =8;
         if (n%2==0){
           System.out.println("even number");}
         else{
             System.out.println("odd number");}
     
         int k =4;
         switch (k) {
             case 1:
             System.out.println("Exellent");
                 break;
             case 2:
             System.out.println("Very Good");
                 break;
             case 3:
             System.out.println("Good");
                 break;
             case 4:
             System.out.println("pass");
                 break;
             case 5:
             System.out.println("Fail");
                 break;
             default:
                 System.out.println("Invalid");
                 }
         
          for (int f=1;f<=10;f++){
          System.out.println("5 x " + f + " = " + (5 * f));
          }
          
           Scanner i = new Scanner(System.in);
            int sum = 0;
            int num;
            
             while (true) {
            num = i.nextInt();
            if (num == 0) {
                break;
            }

            sum += num;
            
        }
         System.out.println("Sum = " + sum);
          //point#5
         //Array + Random + Min/Max/Average
        int[] arr = new int[10];
        Random rand = new Random();
       
        for (int m = 0; m < arr.length; m++)
        {
            arr[m] = rand.nextInt(100);
            System.out.print(arr[m] + " ");
        }

        System.out.println();
        
       //point #6 
       //ArrayList 
        ArrayList<String> list = new ArrayList<>();
         list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JS");
        list.add("Go");

        for (String item : list) {
            System.out.println(item);
        }

        list.remove("C++");

        System.out.println("After removal:");
        System.out.println(list);

        //point #7  HashMap 
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ali", 90);
        map.put("Sara", 85);
        map.put("Omar", 78);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        
        System.out.println(isEven(4));
        System.out.println(factorial(5));
        System.out.println(reverseString("Java"));
        } 
        
        
    }
          //Point 4
        // helper methods
        
     public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    
    
    
      
    
}
      
