/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser  {

    // Method to handle UserStatus enum input
    public void statusDetail(Status.UserStatus status) {
        switch (status) {
            case REJECTED:
                System.out.println("User  status: REJECTED");
                break;
            case PENDING:
                System.out.println("User  status: PENDING");
                break;
            case PROCESSING:
                System.out.println("User  status: PROCESSING");
                break;
            case APPROVED:
                System.out.println("User  status: APPROVED");
                break;
            default:
                System.out.println("Unknown status");
                break;
        }
    }

    // Method to handle string input
    public void statusDetail(String code) {
        switch (code.toUpperCase()) {
            case "ZERO":
                System.out.println("User  status: REJECTED");
                break;
            case "ONE":
                System.out.println("User  status: PENDING");
                break;
            case "TWO":
                System.out.println("User  status: PROCESSING");
                break;
            case "THREE":
                System.out.println("User  status: APPROVED");
                break;
            default:
                System.out.println("NOT VALID CODE");
                break;
        }
    }
}
