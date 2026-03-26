package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessagePostTest {
    MessagePost messagePost1;
    MessagePost messagePost2;
    MessagePost messagePost3;


    @BeforeEach
    void setUp() {
        messagePost1 = new MessagePost("Mary", "Hi there.");
        messagePost2 = new MessagePost("John", "I'm on my way.");
        messagePost3 = new MessagePost("Lee", "Hello World");
    }

    @AfterEach
    void tearDown() {
        messagePost1 = null;
        messagePost2 = null;
        messagePost3 = null;
    }

    @Test
    void setMessage() {
        assertEquals("Hi there." ,messagePost1.getMessage());
        assertEquals("I'm on my way." ,messagePost2.getMessage());

        messagePost1.setMessage("Bye Bye");
        messagePost2.setMessage("Wait.. Wait..");
        assertEquals("Bye Bye", messagePost1.getMessage());
        assertEquals("Wait.. Wait..", messagePost2.getMessage());
        //TODO  test when try to set a message that's too long
        messagePost3.setMessage("This message will be too long and won't work. I'm not sure how long this is but it's probably long enough nowfffffffffffffffffffffffffffffffffffffffffffffffffffffff");
        assertEquals("", messagePost3.getMessage());
    }
}