package EmailApp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Email email = new Email("Daniel", "Davidov");
        Password password = new Password();

        // Show info
        System.out.println("Your email is: " + email.getEmail());
        System.out.println("Your password is: " + password.getPassword());

        // Ask whether to change the email
        System.out.print("Do you want to change your current email? (y/n) ");
        char response = scanner.nextLine().charAt(0);
        if (response == 'y') {
            System.out.print("Enter your preferred email: ");
            String newEmail = scanner.nextLine();
            email.setEmail(newEmail);
            System.out.println("Email changed: " + email.getEmail());
        }

        // Ask whether to change the password
        System.out.print("Do you want to change your current password? (y/n) ");
        response = scanner.nextLine().charAt(0);
        if (response == 'y') {
            System.out.print("Enter your preferred password: ");
            String newPassword = scanner.nextLine();
            password.changePassword(newPassword);
            System.out.println("Password changed: " + password.getPassword());
        }
    }
}
