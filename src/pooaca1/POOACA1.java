/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooaca1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marktimestwo
 */
public class POOACA1 {
    
    //Using four parameters to validate student data
    public static boolean isValidData(String firstName, String secondName, int numClasses, String studentNumber) {
        
        boolean isValid = true;
        //Validating if first name matches
        if (!firstName.matches("[a-zA-Z]")) {
            System.out.println("Invalid First Name: Should only contain letters.");
            isValid = false; 
        }
        //Validating if second name matches
        if (!secondName.matches("[a-zA-Z0-9]+")) {
            System.out.println("Invalid Second Name: Should contain letters and/or numbers.");
            isValid = false;
        }
        //Validating if number of class matches
        if (numClasses < 1 || numClasses > 8) {
            System.out.println("Invalid Number of Classes: Should be between 1 and 8.");
            isValid = false;
        }
        //Validating if student number matches
        if (!studentNumber.matches("2[0-9][a-zA-Z]{3}\\d{3}")) {
            System.out.println("Invalid Student Number Format.");
            isValid = false;
        }
        
        return isValid;
    }
    //Using a method to categorize number of classes based on workload
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
    //Using a new method to process student data from a file and using ArrayList to store valid student data
    public static void processStudentData(String inputFilePath, String outputFilePath) {
        ArrayList<String[]> validStudents = new ArrayList<>();
        //Using BufferedReader to read from a file on laptop
        try (BufferedReader br = new BufferedReader(new FileReader("//Users//marktimestwo//Documents//students.txt"))) {
            String line;
            while ((line = br.readLine()) != null {
                String firstName = line.trim();
                
                int numClasses;
                try {
                    numClasses = Integer.parseInt(br.readLine().trim());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid format for number of classes. Please enter a numeric value.");
                    continue;
                }
                
                String studentNumber = br.readLine().trim();
                
                String secondName = "";
                
                if (isValidData(firstName, secondName, numClasses, studentNumber)) {
                    String workload = determineWorkload(numClasses);
                    validStudents.add(new String[]{studentNumber, secondName, workload});
                } else {
                    System.out.println("Invalid data for student " + firstName + " " + secondName + ". Skipping.");
                } 
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        
        try (BufferedWriter writer = new Bufferedwriter(new FileWriter("//Users//marktimestwo//Documents//status.txt", true))) {
           for (String[] student : validStudents) {
               writer.write(student[0] + " - " + student[1] + "\n" + student[2] + "\n");          
           } 
           System.out.println("Data written to " + outputFilePath);
        } catch (IOException e) {
           System.out.println("Error writing to " + outputFilePath + ": " + e.getMessage());
        } finally {
            Object writer = null;
            if (writer != null) {
                writer.closed();
            }
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
