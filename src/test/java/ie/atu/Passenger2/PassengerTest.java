package ie.atu.Passenger2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @BeforeEach
    void setUp() {
        Passenger newPass = new Passenger("Mr", "Patryk", "1234334567890", "0853849583", 26);
    }

    @Test
    void detailsTest(){
        Passenger newPass = new Passenger("Mr", "Patryk", "1234567890", "0853849583", 26);
        assertEquals("Mr", newPass.getTitle());
        assertEquals("Patryk", newPass.getName());
        assertEquals("1234567890", newPass.getId());
        assertEquals("0853849583", newPass.getPhone());
        assertEquals(26, newPass.getAge());
    }

    @Test
    void testTitleFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Passenger("Mister", "John Doe", "1235473822", "1222222223", 19);});
        assertEquals("This is not a valid name. Use Mr, Ms or Mrs.", exMessage.getMessage());
    }

    @Test
    void nameTestFail(){
        Passenger newPass = new Passenger("Mr", "Pa", "1234567890", "0853849583", 26);
        IllegalArgumentException exception =  assertThrows(IllegalArgumentException.class, newPass::getName);
        assertEquals("This is not a valid name, must be three or more characters", exception.getMessage());
    }

    @Test
    void idTestFail(){
        Passenger newPass = new Passenger("Mr", "Patryk", "123456789", "0853849583", 26);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, newPass::getId);
        assertEquals("ID must be at least 10 characters long", exception.getMessage());
    }

    @Test
    void phoneLenTestFail(){
        Passenger newPass = new Passenger("Mr", "Patryk", "123456789", "085384", 26);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, newPass::getPhone);
        assertEquals("Phone number must be at least 7 digits", exception.getMessage());

    }

    @Test
    void phoneAlphTestFail(){
        Passenger newPass = new Passenger("Mr", "Patryk", "123456789", "085384sfa", 26);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, newPass::getPhone);
        assertEquals("Phone number must contain only digits", exception.getMessage());
    }

    @Test
    void ageTestFail(){
        Passenger newPass = new Passenger("Mr", "Patryk", "123456789", "08538dsax", 16);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, newPass::getAge);
        assertEquals("Passenger must be over 16 to fly", exception.getMessage());
    }

    @Test
    void titleSetMrsTest(){
        Passenger newPass = new Passenger("Mr", "Patryk", "1234567890", "0853849583", 26);
        newPass.setTitle("Mrs");
        assertEquals("Mrs", newPass.getTitle());
    }

    @Test
    void titleSetMsTest(){
        Passenger newPass = new Passenger("Mr", "Patryk", "1234567890", "0853849583", 26);
        newPass.setTitle("Ms");
        assertEquals("Ms", newPass.getTitle());
    }

    @Test
    void nameSetTest(){
        Passenger newPass = new Passenger("Mr", "Patryk", "1234567890", "0853849583", 26);
        newPass.setName("Joe");
        assertEquals("Joe", newPass.getName());
    }

    @Test
    void idSetTest(){
        Passenger newPass = new Passenger("Mr", "Patryk", "1234567890", "0853849583", 26);
        newPass.setId("0987654321");
        assertEquals("0987654321", newPass.getId());
    }

    @Test
    void phoneSetTest(){
        Passenger newPass = new Passenger("Mr", "Patryk", "1234567890", "0853849583", 26);
        newPass.setPhone("085283746");
        assertEquals("085283746", newPass.getPhone());
    }

    @Test
    void ageSetTest(){
        Passenger newPass = new Passenger("Mr", "Patryk", "1234567890", "0853849583", 26);
        newPass.setAge(17);
        assertEquals(17, newPass.getAge());
    }

    @AfterEach
    void tearDown() {
    }
}