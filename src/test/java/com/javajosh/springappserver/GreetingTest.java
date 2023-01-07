package com.javajosh.springappserver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// A plain Java unit test. No Spring dependency
class GreetingTest {

    @Test
    void getId() {
        Greeting g = new Greeting(1L, "Alice");
        Assertions.assertEquals(1, g.getId());
    }

    @Test
    void getContent() {
        Greeting g = new Greeting(1L, "Alice");
        Assertions.assertEquals("Alice", g.getContent());
    }
}