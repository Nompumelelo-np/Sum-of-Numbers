/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumofnumbers;
import java.util.Scanner;

/**
 *
 * @author Acer-User
 */
public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int digit;
        int sum = 0;
        
        
        while (number > 0)
        {
        digit = number % 10; 
        sum = sum + digit;  
        number = number / 10;  
        
        }
        System.out.println("Sum of Digits: " + sum);     
    }
}
