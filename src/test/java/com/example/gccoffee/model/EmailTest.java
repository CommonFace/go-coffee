package com.example.gccoffee.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            var email = new Email("accccc");
        });
    }

    @Test
    public void testValidEmail() {
        var email = new Email("hello0906@gmail.com");
        assertTrue(email.getAddress().equals("hello0906@gmail.com"));
    }

    @Test
    public void testEqEmail() {
        var email = new Email("hello0906@gmail.com");
        var email2 = new Email("hello0906@gmail.com");
        assertTrue(email.equals(email2));
    }

}