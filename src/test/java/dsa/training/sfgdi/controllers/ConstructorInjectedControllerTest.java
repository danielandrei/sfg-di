package dsa.training.sfgdi.controllers;

import dsa.training.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

  ConstructorInjectedController controller;

  @BeforeEach
  void setUp() {

    controller = new ConstructorInjectedController(new ConstructorGreetingService());

  }

  @Test
  void getGreeting() {

    System.out.println(controller.getGreeting());

  }
}