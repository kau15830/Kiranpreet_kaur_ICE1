/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi 
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    



    // Enum to represent user statuses
  

    // Enum to represent user statuses
   
    // Enum to represent user statuses
    public enum UserStatus {
        REJECTED,
        PENDING,
        PROCESSING,
        APPROVED;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (0 for REJECTED, 1 for PENDING, 2 for PROCESSING, 3 for APPROVED) or type ZERO, ONE, TWO, THREE:");

        String input = in.next(); // Accept string input

        // Create an instance of StausUser 
        StausUser  userStatusHandler = new StausUser ();

        // Check if the input is a number
        if (input.matches("\\d+")) {
            int code = Integer.parseInt(input); // Convert string to integer

            // Check if the input is within the valid range
            if (code < 0 || code >= UserStatus.values().length) {
                System.out.println("Invalid status code. Please enter a number between 0 and 3.");
                return;
            }

            // Convert the integer input to UserStatus enum
            UserStatus status = UserStatus.values()[code];
            userStatusHandler.statusDetail(status); // Pass enum to the method
        } else {
            userStatusHandler.statusDetail(input); // Pass string input to the method
        }
    }
}
