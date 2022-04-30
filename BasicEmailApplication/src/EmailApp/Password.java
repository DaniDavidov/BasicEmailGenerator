package EmailApp;

import java.util.Scanner;

public class Password {
    Scanner scanner = new Scanner(System.in);
    private String password;
    private int passwordLength;

    public Password() {
        // Ask for the length of the password
        // Call a method to return the random generated password
        System.out.print("Enter the length of the password: ");
        this.passwordLength = Integer.parseInt(scanner.nextLine());
        this.password = generatePassword(this.passwordLength);
    }
    // Generate random password
    private String generatePassword(int length) {
        final String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password.append(passwordSet.charAt(random));
        }
        return password.toString();
    }
    // Method to return the new password
    public void changePassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
