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
    
    public void setRadius(double circleRadius)
    {
        radius = circleRadius;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    // methods
    public double area()
    {
        return PI * radius * radius;
    }
    
    public double diameter()
    {
        return radius * 2;
    }
    
    public double circumference()
    {
        return 2 * PI * radius;
    }
}
