package com.Problem.Solving;
import java.io.*;
import java.util.*;

// 1. A class named Arithmetic with a method named add
class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

// 2. A class named Adder that inherits from Arithmetic
class Adder extends Arithmetic {
    // Inherits the add method automatically
}

public class inheritance2{

    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());    
        
        // Print the result of 3 calls using the add method
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}

