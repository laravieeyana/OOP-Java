/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercises;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
       
        while (temp != 0) {
            sum += temp % 10;  
            temp /= 10;      
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}

