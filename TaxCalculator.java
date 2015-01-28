package com.TaxCalculator;

import com.sun.org.apache.bcel.internal.generic.Instruction;
import sun.org.mozilla.javascript.internal.ast.SwitchStatement;

import java.util.Scanner;

/**
 * Created by muskan on 1/27/15.
 */
public class TaxCalculator {
    public static double ForSingle(double income){
        double tax = 0;
        if (income<80000)
        {
           tax=0;
        }
        else if(income>80000 && income<155000)
        {
            tax=(income-80000)/10;
        }
        else if(income >155000)
        {
            tax=((income-155000)/4)+((155000-80000)/10);
        }
       return tax;

    }
    public static double ForCouple(double income){
        double tax = 0;
        if (income<100000)
        {
            tax=0;
        }
        else if(income>100000 && income<175000)
        {
            tax=(income-100000)/10;
        }
        else if(income >175000)
        {
            tax=((income-175000)/4)+((155000-100000)/10);
        }
        return tax;


    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter 'S' for single and 'C' for double:");
        String choice=input.nextLine();
        System.out.println("Enter your Income:");
        double Income=input.nextDouble();
        double tax=0;
        switch (choice.toUpperCase()){
            case "S" :
                tax = ForSingle(Income);
                break;
            case "C":
                tax= ForCouple(Income);
                break;
            default:
                break;

        }
        double providentfund=Income/10;
        double netincome=Income-tax-providentfund;
        System.out.println("Annual Tax Report\n============================");
        System.out.println("Income="+Income);
        System.out.println("Tax="+tax);
        System.out.println("Provident Fund="+providentfund);
        System.out.println("Net Income="+netincome);



    }
}
