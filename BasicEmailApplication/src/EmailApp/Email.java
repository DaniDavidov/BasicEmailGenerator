package EmailApp;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Email {
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String department;
    private int mailboxCapacity = 10;
    private String alternateEmail;
    private String email;
    final String companySuffix = "company.com";

    // Constructor to receive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method to ask for the department - return the department
        this.department = setDepartment();

        // Creating the email
        email = firstName.toLowerCase(Locale.ROOT) + lastName.toLowerCase(Locale.ROOT) + "@" + department + companySuffix;

    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("Department codes:\n1 - for Sales\n2 - for Development\n3 - for Accounting\n4 - for none\nEnter department code: ");
        char option = scanner.nextLine().charAt(0);
        return switch (option) {
            case '1' -> "sales";
            case '2' -> "dev";
            case '3' -> "acct";
            default -> "";
        };
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
}
