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
        double pizzaRadius; // user's input for the radius of the pizza in inches

        // define keyboard object
        Scanner keyboard = new Scanner(System.in);
        
        // ask the user for the circle's radius in inches
        System.out.println("What is the radius of Orlando's pizza, in inches?");
        
        // read the user's response for the pizza's radius in inches
        pizzaRadius = keyboard.nextDouble();
        
        // create a circle object, which will be a delicious pizza
        Circle pizza = new Circle(pizzaRadius);
        
        // calculate and display the the area of the tasty pizza
        System.out.println("The area of Orlando Marin's pizza is " + pizza.area() + " square inches");
        
        // calculate and display the diameter of the yummy pizza
        System.out.println("The diameter of Orlando Marin's pizza is " + pizza.diameter() + " inches");
        
        // calculate and display the circumference of the mouth watering pizza
        System.out.println("The circumference of Orlando Marin's pizza is " + pizza.circumference() + " inches");
    }
}
