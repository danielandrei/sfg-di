package dsa.training.sfgdi.controllers;

import dsa.training.sfgdi.services.GreetingService;

public class PropertyInjectedController {

  public GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }

}
