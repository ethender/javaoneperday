package com.aarambhweb.chapter3selections;

import java.util.Scanner;

public class QuadraticEquations3_1 {


    /**
     * Caluculating b^2 +/- Sqrt(b^2-4ac) / 2a
     * @param a
     * @param b
     * @param c
     * @param isR1
     * @return calculation result
     */
    public static double calculateR(double a, double b, double c, boolean isR1){
        double b24ac = Math.sqrt((Math.pow(b, 2) - (4 * a * c)));

        double rootNegative = isR1 ? (-b + b24ac) : (-b - b24ac);

        return rootNegative/(2*a);
    }


    public static void main(String[] args){
        System.out.println("Two root quadratic equations for a quadratic equation:");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a ");
        double a = input.nextDouble();
        System.out.print("Enter b ");
        double b = input.nextDouble();
        System.out.print("Enter c ");
        double c = input.nextDouble();

        System.out.print(String.format("The equation has two roots : %s and %s",calculateR(a,b,c,true),calculateR(a,b,c,false)));
    }
}
