package com.example.oops;

import java.util.Scanner;

public class Excercise_1Area {
    public static void main(String[] args) {
        Area r1 = new Area();
        String choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: Rectangle,Sqare,Circle ");
        choice = sc.next();
        if (choice.equals("Rectangle")) {
           r1.areaOfRectangle();
        }else if (choice.equals("Square")){
            r1.areaOfSqare();
        }else if (choice.equals("Circle")){
            r1.areaOfCircle();
        }

    }
}
     class Area {

         float area;
         final float PI=3.14f;
         float value1, value2;
         Scanner sc=new Scanner(System.in);
         //method of area of Rectangle
         public void areaOfRectangle(){

             System.out.println("Enter the length: ");
             value1 = sc.nextFloat();
             System.out.println("Enter the width: ");
             value2 = sc.nextFloat();
             System.out.println("Area of Rectangle is: "+value1*value2);
         }
         //method of area of Square
         public void areaOfSqare(){
             System.out.println("Enter the area: ");
             value1=sc.nextFloat();
             System.out.println("Area of Square is: "+value1*value1);
         }
         // method for area of circle
         public void areaOfCircle(){
             System.out.println("Enter the Radius");
             value1= sc.nextFloat();
             System.out.println("Area of Circle is: "+PI*(value1*value1));
         }
     }

