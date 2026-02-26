package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloControllerTest {

  @Test
  void testMessage() {
    HelloController c = new HelloController();
    assertTrue(c.home().contains("Jenkins"));
  }
}
