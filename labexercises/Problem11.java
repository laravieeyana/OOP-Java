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
public class Problem11 {
  
public class PersonalEducationalInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a Name: ");
        String name = input.nextLine();
        System.out.println(" Date of Birth: ");
        String name1 = input.nextLine();
        System.out.println("Address: ");
        String name2 = input.nextLine();
        System.out.println("Age: ");
        String name3 = input.nextLine();
        System.out.println("Course: ");
        String name4 = input.nextLine();
        System.out.println(" Year Level: ");
        String name5 = input.nextLine();
        System.out.println(" Secondary School Graduated: ");
         String name6 = input.nextLine();
        System.out.println(" Year: ");
         String name7 = input.nextLine();
        System.out.printf("\n==================== PERSONAL INFO ==================== \n");
        System.out.printf(" %-19s\n", "Name", name);
        System.out.printf(" %-19s\n" , "Date of Birth", name1);
        System.out.printf(" %-19s\n",  "Address",  name2);
        System.out.printf(" %-19s\n",   "Age " ,   name3);
        System.out.printf(" %-19s\n",   "Course",  name4);
        System.out.printf(" %-19s\n",    "Year" ,  name5 );
        System.out.printf("\n==================== EDUCATIONAL INFO ====================");
         System.out.printf( "%-19s\n", "SECONDARY  Level", name6); 
        System.out.printf(" %-19s\n", "SECONDARY  School Graduated", name7);
        System.out.printf(" %-19s\n",  "YEAR",    name6);
    }
}

}
