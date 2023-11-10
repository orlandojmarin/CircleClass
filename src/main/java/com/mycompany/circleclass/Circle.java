/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.circleclass;

/**
 *
 * @author orlandomarin
 */
public class Circle 
{
    // instance fields
    private double radius;
    private final double PI = 3.14159;
    
    public Circle(double circleRadius)
    {
        radius = circleRadius;
    }
    
    public Circle()
    {
        radius = 0.0;
    }
    
    // setRadius changes the value of the radius with the specified argument
    public void setRadius(double circleRadius)
    {
        radius = circleRadius;
    }
    
    // getRadius returns the value of the radius field
    public double getRadius()
    {
        return radius;
    }
    
    // area calculates and returns the value of the area of the circle
    public double area()
    {
        return PI * radius * radius;
    }
    
    // diameter calculates and returns the value of the diameter of the circle
    public double diameter()
    {
        return radius * 2;
    }
    
    // circumference calculates and returns the value of the circumference of the circle
    public double circumference()
    {
        return 2 * PI * radius;
    }
}
