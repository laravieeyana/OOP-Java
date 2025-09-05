package basicdatatypes;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Input
        System.out.println("Input distance in meters: ");
        double distance = input.nextDouble();
        
        System.out.println("Input hours: ");
        int hours = input.nextInt();
        
        System.out.println("Input minutes: ");
        int minutes = input.nextInt();
        
        System.out.println("Input seconds: ");
        int seconds = input.nextInt();
        
        //Convert time to total seconds
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        
        //Speeds
        double mps = distance / totalSeconds; //meters per seconds
        double kph = (distance / 1000.0) / (totalSeconds / 3600.0); //km/h
        
        //Output
        System.out.println("Your speed in meers / second is " + mps);
        System.out.println("Your speed in km/h is" + kph);
        System.out.println("Your speed in miles/h is" + mps);
    }
}
