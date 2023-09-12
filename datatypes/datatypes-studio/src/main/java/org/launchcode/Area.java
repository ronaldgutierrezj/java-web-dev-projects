package org.launchcode;
import java.util.Scanner;


public class Area {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius;

//       if (input.hasNextDouble()){
////           double radius = input.nextDouble();
////           if (radius <= 0) {
////               System.out.println("Enter a positive number");
////           } else {
////               System.out.println("The area of a circle of radius " + radius  + " is: " + Circle.getArea(radius));
////           }
////       } else {
////           System.out.println("Wrong enter");
////       }
//
////        while (!input.hasNextDouble()){
////            System.out.println("Enter a correct radius");
////            input.next();
////
////        }
////        while(input.nextDouble() <= 0) {
////            System.out.println("Enter a positive radius");
////            input.next();
////        }
////        radius = input.nextDouble();
////        System.out.println("The area of a circle of radius " + radius  + " is: " + Circle.getArea(radius));

        do {
            System.out.println("enter a positive number");
            while (!input.hasNextDouble()){
                System.out.println("enter must be a number");
                input.next();
            }
            radius = input.nextDouble();


        }  while (radius <= 0);
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius  + " is: " + area);
        input.close();
    }
}
