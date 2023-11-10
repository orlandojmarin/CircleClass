/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circleclass;
import java.util.Scanner;

/**
 *
 * @author orlandomarin
 */
public class CircleClass {

    public static void main(String[] args) 
    {
        // variables
        double circleRadius;

        // define keyboard object
        Scanner keyboard = new Scanner(System.in);
        
        // ask the user for the circle's radius in inches
        System.out.println("What is the radius of Orlando's pizza, in inches?");
        
        // read the user's response
        circleRadius = keyboard.nextDouble;
        
        // create a circle object (pizza)
        Circle pizza = new Circle(circleRadius);
        
        // report the circle / pizza's area, diameter, and circumference
        pizza.area();
        System.out.println("The area of Orlando Marin's pizza is " + pizza.area());
        
        pizza.diameter();
        System.out.println("The diameter of Orlando Marin's pizza is " + pizza.diameter());
        
        pizza.circumference();
        System.out.println("The circumference of Orlando Marin's pizza is " + pizza.circumference());
    }
}
