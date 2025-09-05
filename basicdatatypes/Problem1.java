/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicdatatypes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5/9;
        
        System.out.println(fahrenheit + "degrees Fahrenheit is equal to" + celsius + "in Celsius");
    }
}
