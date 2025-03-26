package ie.atu;

public class Passenger {

    private String title;
    private String firstName;
    private String lastName;

    public Passenger(String title, String firstName, String lastName) {
        if (!isValidTitle(title)) {
            throw new IllegalArgumentException("Invalid title. Title must be 'Mr', 'Mrs', or 'Ms'");
        }
        if (firstName == null || firstName.trim().length() < 3) {
            throw new IllegalArgumentException("First name must be at least 3 characters long");
        }
        if (lastName == null || lastName.trim().length() < 3) {
            throw new IllegalArgumentException("Last name must be at least 3 characters long");
        }

        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private boolean isValidTitle(String title) {
        return title.equals("Mr") || title.equals("Mrs") || title.equals("Ms");
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}