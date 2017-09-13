package com.example.java;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     //to get input from user
        System.out.println("Enter the number you want in order to find out the area of that shape. ");    //ask the user for input
        System.out.println("1.Square\n2.Circle\n3.Triangle\n4.Trapezoid");
        int input = scanner.nextInt();                //Store input into a variable
        double squareArea = 0;
        double circleArea = 0;
        double tirangleArea = 0;
        double trapezoidArea = 0;
        double area = 0;
        switch(input){
            case 1:
                area = squareCalc();
                break;
            case 2:
                area = circleCalc();
                break;
            case 3:
                area = triangleCalc();
                break;
            case 4:
                area = trapezoidCalc();
                break;
        }
        System.out.println(area);

    }

    public static double squareCalc() {
        double squareSide = 5.0;
        return squareSide * squareSide;
    }

    public static double circleCalc() {
        double radius = 25.0;
        return Math.PI * (radius*radius);
    }

    public static double triangleCalc() {
        double triangleB = 5;
        double triangleH = 10;
        return (triangleB * triangleH) * 1.5;
    }

    public static double trapezoidCalc() {
        double trapTop = 5;
        double trapBottom = 15;
        double trapHeight = 3;
        return ((trapTop + trapBottom) / 2) * trapHeight;
    }
}
