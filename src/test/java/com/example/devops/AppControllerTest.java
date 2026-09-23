package com.example.devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppControllerTest {

    private final AppController controller = new AppController();

    @Test
    void homeTest() {
        String response = controller.home();

        assertEquals(
                "Hello from Java DevOps Application!",
                response
        );
    }

    @Test
    void healthTest() {
        String response = controller.health();

        assertEquals(
                "Application is healthy",
                response
        );
    }
}
