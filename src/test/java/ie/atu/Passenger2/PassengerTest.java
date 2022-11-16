package ie.atu.Passenger2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @BeforeEach
    void setUp() {
    }


    @Test
    void detailsTest(){
        Passenger newPass = new Passenger("Mr", "Patryk", "1234567890", "0853849583", 21);
        assertEquals("Mr", newPass.getTitle());
    }

    @AfterEach
    void tearDown() {
    }
}