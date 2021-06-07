package com.examples;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myObj = new Scanner(System.in);

        System.out.print("What is the first number? ");
            String FirstStr = myObj.nextLine();
            int FirstNum = Integer.parseInt(FirstStr);

        System.out.print("What is the second number? ");
            String SecondStr = myObj.nextLine();
            int SecondNum = Integer.parseInt(SecondStr);

        int Addition = FirstNum + SecondNum;
        int Subtraction = FirstNum + SecondNum;
        int Multiplication = FirstNum * SecondNum;
        int Division = FirstNum / SecondNum;

        System.out.println(FirstNum + " + " + SecondNum + " = " + Addition +
            "\n" + FirstNum + " - " + SecondNum + " = " + Subtraction +
            "\n" + FirstNum + " * " + SecondNum + " = " + Multiplication +
            "\n" + FirstNum + " / " + SecondNum + " = " + Division);
    }
}
