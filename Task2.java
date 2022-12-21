/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author Farouk
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the ASCII value of the character");
        int ascii = input.nextInt();
        char ch = (char) ascii;
        System.out.println("\nThe character is \'" + ch + "\'");

    }

}
