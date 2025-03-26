package ie.atu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter passenger details:");
        System.out.print("Title (Mr, Mrs, Ms): ");
        String title = scanner.nextLine();

        System.out.print("First name (min 3 chars): ");
        String firstName = scanner.nextLine();

        System.out.print("Last name (min 3 chars): ");
        String lastName = scanner.nextLine();

        try {
            Passenger passenger = new Passenger(title, firstName, lastName);
            System.out.println("\nPASSENGER CREATED SUCCESSFULLY:");
            System.out.println(passenger.getTitle() + " " +
                    passenger.getFirstName() + " " +
                    passenger.getLastName());
        } catch (IllegalArgumentException ex) {
            System.out.println("\nERROR: " + ex.getMessage());
        }

        scanner.close();
    }
}