/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooaca1;

import java.util.Scanner;

/**
 *
 * @author marktimestwo
 */
public class POOACA1 {
    
    public static boolean isValidData(String firstName, String secondName, int numClasses, String studentNumber) {
        
        boolean isValid = true;
        
        if (!firstName.matches("[a-zA-Z]")) {
            System.out.println("Invalid First Name: Should only contain letters.");
            isValid = false;
        }
        
        if (!secondName.matches("[a-zA-Z0-9]+")) {
            System.out.println("Invalid Second Name: Should contain letters and/or numbers.");
            isValid = false;
        }
        
        if (numClasses < 1 || numClasses > 8) {
            System.out.println("Invalid Number of Classes: Should be between 1 and 8.");
            isValid = false;
        }
        
        if (!studentNumber.matches("2[0-9][a-zA-Z]{3}\\d{3}")) {
            System.out.println("Invalid Student Number Format.");
            isValid = false;
        }
        
        return isValid;
    }
    
    public static String determineWorkload(int numClasses) {
        if (numClasses == 1) {
            return "Very Light";
        } else if (numClasses == 2) {
            return "Light";
        } else if (numClasses >= 3 && numClasses <= 5) {
            return "Part Time";
        } else {
            return "Full Time";
        }
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Using scanner for user input
        
        // Using an infinite loop until user chooses an option
        while (true) {
            // Menu options to choose from
            System.out.println("Menu");;
            System.out.println("1. Standard Operation");
            System.out.println("2. Add Validated data to statu.txt via Console");
            System.out.println("3. Exit");
            
            // Asking the user to choose between options
            System.out.println("Choose an option (1-3): ");
            int choice = scanner.nextInt(); 
            
            switch (choice) {
                case 1:
                    break;
                
                case 2:
                    break;
                    
                case 3:
                    break;
                    
                default:
                    System.out.println("Invalid option. Please choose a number between 1 and 3.");
                    
            }
                    
        }
        
        
    }
    
}
