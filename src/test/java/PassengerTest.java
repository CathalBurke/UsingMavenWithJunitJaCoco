import ie.atu.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {

    Passenger passenger;


    @BeforeEach
    void setUp() {

    }
    @Test
    void testValidPassenger() {
        passenger = new Passenger("Ms", "Sarah", "Jones");
        assertEquals("Ms", passenger.getTitle());
        assertEquals("Sarah", passenger.getFirstName());
        assertEquals("Jones", passenger.getLastName());
    }

    @Test
    void testInvalidTitle() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Dr", "John", "Smith");
        });
        assertEquals("Invalid title. Title must be 'Mr', 'Mrs', or 'Ms'", ex.getMessage());
    }

    @Test
    void testShortFirstName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Mr", "Jo", "Smith");
        });
        assertEquals("First name must be at least 3 characters long", ex.getMessage());
    }

    @Test
    void testShortLastName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Mrs", "Alice", "Li");
        });
        assertEquals("Last name must be at least 3 characters long", ex.getMessage());
    }
    @Test
    void testNullFirstName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Mr", null, "Smith");
        });
        assertEquals("First name must be at least 3 characters long", ex.getMessage());
    }
    @Test
    void testNullLastName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Ms", "Jane", null);
        });
        assertEquals("Last name must be at least 3 characters long", ex.getMessage());
    }
}