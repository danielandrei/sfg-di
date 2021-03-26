package dsa.training.sfgdi.controllers;

import dsa.training.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

  ConstructorInjectedController controller;

  @BeforeEach
  void setUp() {

    controller = new ConstructorInjectedController(new GreetingServiceImpl());

  }

  @Test
  void getGreeting() {

    System.out.println(controller.getGreeting());

  }
}