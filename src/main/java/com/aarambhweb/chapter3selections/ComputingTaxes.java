package com.aarambhweb.chapter3selections;

import java.util.Scanner;

public class ComputingTaxes {

    /**
     * Income for single filler
     * @param income : tax payer income
      * @return  tax amount: calculate tax amount
     */
    public static double singleTaxAmount(double income){
        double tax = 0.0;

        if(income <= 8350){
            tax = tax*0.1;
        }else if(income > 8351 && income <= 33950){
            tax = 8350*0.1 + (income - 8350) * 0.15;
        }else if(income >33951 && income <= 82250) {
            tax = 8350*0.1 + 33590  * 0.15 + (income - 82250) * 0.25;
        }else if(income >82251 && income <= 171550) {
            tax = 8350 * 0.1 + 33590 * 0.15 + 82250 * 0.25 + (income - 171550) * 0.28;
        }else if(income >171551 && income <= 372950) {
            tax = 8350 * 0.1 + 33590 * 0.15 + 82250 * 0.25 + 171550 * 0.28 + (income - 372950) * 0.33;
        }else if(income > 372950 ) {
            tax = 8350 * 0.1 + 33590 * 0.15 + 82250 * 0.25 + 171550 * 0.28 + 372950 * 0.33 + (income - 372950) * 0.35;
        }

        return tax;
    }


    /**
     * Income for family joint filler
     * @param income : tax payer income
     * @return  tax amount: calculate tax amount
     */
    public static double familyJointTaxAmount(double income){
        double tax = 0.0;

        if(income <= 16700){
            tax = tax*0.1;
        }else if(income > 16701 && income <= 67900){
            tax = 16700*0.1 + (income - 16700) * 0.15;
        }else if(income >67901 && income <= 137050) {
            tax = 16700*0.1 + 67900  * 0.15 + (income - 16700) * 0.25;
        }else if(income >137051 && income <= 208850) {
            tax = 16700 * 0.1 + 67900 * 0.15 + 137050 * 0.25 + (income - 137050) * 0.28;
        }else if(income >208851 && income <= 372950) {
            tax = 16700 * 0.1 + 67900 * 0.15 + 137050 * 0.25 + 208850 * 0.28 + (income - 208850) * 0.33;
        }else if(income > 372951 ) {
            tax = 16700 * 0.1 + 67900 * 0.15 + 137050 * 0.25 + 208850 * 0.28 + 372950 * 0.33 + (income - 372950) * 0.35;
        }

        return tax;
    }

    /**
     * Income for famil separately filler
     * @param income : tax payer income
      * @return  tax amount: calculate tax amount
     */
    public static double familySeparatelyTaxAmount(double income){
        double tax = 0.0;

        if(income <= 8350){
            tax = tax*0.1;
        }else if(income > 8351 && income <= 33950){
            tax = 8350*0.1 + (income - 8350) * 0.15;
        }else if(income >33951 && income <= 68525) {
            tax = 8350*0.1 + 33950  * 0.15 + (income - 33950) * 0.25;
        }else if(income >68526 && income <= 104425) {
            tax = 8350 * 0.1 + 33950 * 0.15 + 68525 * 0.25 + (income - 68525) * 0.28;
        }else if(income >104426 && income <= 186475) {
            tax = 8350 * 0.1 + 33950 * 0.15 + 68525 * 0.25 + 104425 * 0.28 + (income - 104425) * 0.33;
        }else if(income > 186476 ) {
            tax = 8350 * 0.1 + 33950 * 0.15 + 68525 * 0.25 + 104425 * 0.28 + 186475 * 0.33 + (income - 186475) * 0.35;
        }

        return tax;
    }

    /**
     * Income for house hold filler
     * @param income : tax payer income
     * @return  tax amount: calculate tax amount
     */
    public static double headOfHouseholdTaxAmount(double income){
        double tax = 0.0;

        if(income <= 11950){
            tax = tax*0.1;
        }else if(income > 11951 && income <= 44500){
            tax = 11950*0.1 + (income - 11950) * 0.15;
        }else if(income >44501 && income <= 117450) {
            tax = 11950*0.1 + 44500  * 0.15 + (income - 44500) * 0.25;
        }else if(income >117451 && income <= 190200) {
            tax = 11950 * 0.1 + 44500 * 0.15 + 117450 * 0.25 + (income - 117450) * 0.28;
        }else if(income >190201 && income <= 372950) {
            tax = 11950 * 0.1 + 44500 * 0.15 + 117450 * 0.25 + 190200 * 0.28 + (income - 190200) * 0.33;
        }else if(income > 372951 ) {
            tax = 11950 * 0.1 + 44500 * 0.15 + 117450 * 0.25 + 190200 * 0.28 + 372950 * 0.33 + (income - 372950) * 0.35;
        }

        return tax;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Select Proper Tax Payer:
                0 for single filler
                1 for married filling jointly
                2 for married filling separately
                3 for head of household
                """);

        int status = input.nextInt();

        System.out.println("Enter income: ");
        double income = input.nextDouble();

        double tax = 0;
        if (status == 0) {
            tax = singleTaxAmount(income);
        }else if (status == 1) {
            tax = familyJointTaxAmount(income);
        }else if (status == 2) {
            tax = familySeparatelyTaxAmount(income);
        }else if (status == 3) {
            tax = headOfHouseholdTaxAmount(income);
        }else{
            System.out.println("Invalid Input");
        }

        System.out.println("Tax Amount: " + tax);
    }
}
