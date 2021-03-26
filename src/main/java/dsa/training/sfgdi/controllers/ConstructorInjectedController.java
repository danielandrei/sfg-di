package dsa.training.sfgdi.controllers;

import dsa.training.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

  private final GreetingService greetingService;

  public ConstructorInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }

}
