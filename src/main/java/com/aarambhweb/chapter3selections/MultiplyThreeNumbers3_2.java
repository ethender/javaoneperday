package com.aarambhweb.chapter3selections;


import java.util.Scanner;

public class MultiplyThreeNumbers3_2 {


    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        System.out.println("What is " + number1 + " * " + number2 + " * "+ number3+" ? ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number == (number1 * number2 * number3)) {
            System.out.println("The guessed was correct");
        }else{
            System.out.println("The guessed was not correct");
        }
    }
}
