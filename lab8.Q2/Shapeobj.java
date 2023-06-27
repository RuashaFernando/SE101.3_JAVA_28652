package com.mycompany.shapeobj;
public class Shapeobj 
{
    public static void main(String[] args) 
    {
        Circle c1=new Circle(9.5);
        System.out.println("Area of Circle: "+c1.calculateArea());
        System.out.println("Perimeter of Circle: "+c1.calculatePerimeter());
        
        Rectangle r1=new Rectangle(6.2,9.4);
        System.out.println("Area Rectangle: "+r1.calculateArea());
        System.out.println("Perimeter Rectangle: "+r1.calculatePerimeter());
        
        Traingle t1=new Traingle(15.2,12.5,18.5,22.5);
        System.out.println("Area Traingle: "+t1.calculateArea());
        System.out.println("Perimeter Traingle: "+t1.calculatePerimeter());
    }
    
}
