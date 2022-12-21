/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author Farouk
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // take input from user.....shortcut===alt+enter(adds import up)
        int num1, num2, ncr, npr, factorial = 1, numerator, denominator, denominator2 , i = 1, sub;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter value of n");
        num1 = input.nextInt();
        System.out.println("Please enter value of r");
        num2 = input.nextInt();
        while (i <= num1) {
            factorial = factorial * i;
            i++;
        }
        numerator = factorial; // n!
        sub = num1 - num2;
        factorial = 1;
        i = 1;
        while (i <= sub) {
            factorial = factorial * i;
            i++;
        }
        denominator = factorial; // (n-r)!
        factorial = 1;
        i = 1;
        while (i <= num2) { //r!
            factorial = factorial * i;
            i++;
        }
        denominator = (factorial * denominator); // r!(n-r)!
        ncr = numerator / denominator;
        System.out.println("\nnCr = " + ncr);

        factorial = 1;
        i=1;
        while (i <= sub) {
            factorial = factorial * i;
            i++;
        }
        denominator2 = factorial;
        npr = numerator / factorial;
        System.out.println("\nnPr = " + npr);

    }

}
